package com.Controller;
import java.util.ArrayList;




import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.servlet.http.HttpServletRequest;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.google.gson.Gson;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.util.PortalUtil;


import Bean.LoginBean;
import Bean.NavigationBean;
import Utilities.Utility;

@RequestMapping("VIEW")
@Controller("loginController")

public class LoginController {


@RenderMapping
public ModelAndView Athenticate(final RenderRequest renderRequest, final RenderResponse renderResponse){
	
	ModelAndView modelAndView=new ModelAndView();
	Gson json = new Gson();
	List<NavigationBean> navigationList = new ArrayList<NavigationBean>();
	navigationList=Utility.getNavigationBean();
String navjson=json.toJson(navigationList.toArray(),NavigationBean[].class);
	System.out.println(navjson);
	LoginBean loginBean = new LoginBean();
	modelAndView.addObject("loginBean",loginBean);
	modelAndView.addObject("hi",navjson);
	modelAndView.setViewName("login");
	return modelAndView;
	
}
@ActionMapping(params = "action=authenticate")
public void Authenticate(	
		@ModelAttribute(value = "loginBean") LoginBean loginBean, BindingResult bindingResult, final ActionRequest actionRequest, final ActionResponse actionResponse){
	Gson json = new Gson();
	String username=actionRequest.getParameter("name");
	String password=actionRequest.getParameter("password");
	
	LoginBean loginbean=new LoginBean();
	
	loginbean.setUsername(username);
	loginbean.setPassword(password);
	String finalJson = json.toJson(loginbean,LoginBean.class);
	loginBean=json.fromJson(finalJson, LoginBean.class);
	System.out.println("sdf"+loginBean.getPassword());
	System.out.println("sdfs"+loginBean.getUsername());
 
	 System.out.println("LoginController.Authenticate()");
	 HttpServletRequest httpServletRequest=PortalUtil.getHttpServletRequest(actionRequest);
	 String requesturl=httpServletRequest.getRequestURI();
	 

	
}


	

}
