package com.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;

public class TestExcel123{

    public static void main(String[] args) throws Exception {
        
        try {

            Class.forName("oracle.jdbc.OracleDriver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","exam","exam");
            con.setAutoCommit(false);
            PreparedStatement pstm = null ;
            FileInputStream input = new FileInputStream("C:\\Users\\Administrator\\Desktop\\exam.xls");
            POIFSFileSystem fs = new POIFSFileSystem(input);
            HSSFWorkbook wb = new HSSFWorkbook(fs);
            HSSFSheet sheet = wb.getSheetAt(0);
            Row row;
           for(int i=1; i<=sheet.getLastRowNum(); i++){
                row = sheet.getRow(i);
             
                int question_id = (int) row.getCell(0).getNumericCellValue();
                int course_id=(int) row.getCell(1).getNumericCellValue();
                String question_description= row.getCell(2).getStringCellValue();                
                String question_answer= row.getCell(3).getStringCellValue(); 
                String question_options= row.getCell(4).getStringCellValue(); 
                
                
                String sql = "INSERT INTO oep_questions VALUES(?,?,?,?,?)";
                pstm = (PreparedStatement) con.prepareStatement(sql);
                pstm.setInt(1, question_id);
                pstm.setInt(2, course_id);
                pstm.setString(3, question_description);
                pstm.setString(4, question_answer);
                pstm.setString(5, question_options);
           
                pstm.execute();
               System.out.println("Import rows "+i);
                
               
            }
           		
           
            con.commit();
            pstm.close();
            con.close();
            input.close();
            System.out.println("Success import excel to mysql table");
        }
        catch(ClassNotFoundException e){
            System.out.println(e);
        }catch(SQLException ex){
            ex.printStackTrace();
        }catch(IOException ioe){
            System.out.println(ioe);
        }
    }

}