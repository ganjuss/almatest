package com.Controller;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

public class SignupController {
	@Controller("signupController")
	@RequestMapping("VIEW")
	public class LoginController {
	@RenderMapping
	public ModelAndView userRegistration(RenderRequest renderRequest,RenderResponse renderResponse){
		
		
		return null;
		
	}
}}
