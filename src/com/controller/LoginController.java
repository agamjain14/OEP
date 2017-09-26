package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dao.UserDao;
import com.model.OepUser;
import com.service.UserDaoImplementation;

@Controller
public class LoginController {
	 @Autowired
	  UserDao userService;
	  @RequestMapping(value = "/login", method = RequestMethod.GET)
	  public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("login");
	    mav.addObject("login", new OepUser());
	    return mav;
	  }
	  @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	  public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
	  @ModelAttribute("person") OepUser person) {
	    ModelAndView mav = null;
	    UserDaoImplementation pmd=new UserDaoImplementation();
	    pmd.checkUser("AGAM","ADFF");
	  
	    mav = new ModelAndView("login");
	    mav.addObject("message", "login success");
	    
	    return mav;
	  }
}
