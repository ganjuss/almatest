package com.Controller;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
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
import Bean.SubNav;

@RequestMapping("VIEW")
@Controller("loginController")
public class LoginController {
@RenderMapping
public ModelAndView Athenticate(final RenderRequest renderRequest, final RenderResponse renderResponse){
	
	ModelAndView modelAndView=new ModelAndView();
	Gson json = new Gson();
	LoginBean loginBean = new LoginBean();
	NavigationBean navigationbean =new NavigationBean();
	SubNav subNa=new SubNav();
   subNa.setId("1");
   subNa.setNavLabel("Dance");
   subNa.setNavLink("#");
   navigationbean.setSubNav(subNa);
   navigationbean.setId("arts");
   navigationbean.setNavLabel("ARTS");
   subNa.setId("2");

	String navjson=json.toJson(navigationbean,NavigationBean.class);
	System.out.println(navjson);
	loginBean.setUsername("test");
	modelAndView.addObject("hi",navjson);
	modelAndView.addObject("loginBean",loginBean);
	
	modelAndView.setViewName("login");
	
	return modelAndView;
	
}
@ActionMapping(params = "action=authenticate")
public void Authenticate(	
		@ModelAttribute(value = "loginBean") LoginBean loginBean, BindingResult bindingResult, final ActionRequest actionRequest, final ActionResponse actionResponse){
	Gson json = new Gson();
	String hello=actionRequest.getParameter("name");
	LoginBean loginbean=new LoginBean();
	loginbean.setUsername(hello);
	String finalJson = json.toJson(loginbean , LoginBean.class);
	System.out.println("json is"+finalJson);
	
	 HttpServletRequest request = PortalUtil.getHttpServletRequest(actionRequest);
	 System.out.println("hey there"+request.getParameter("name"));
	 hello = ParamUtil.getString(actionRequest, "name");
	 System.out.println(hello);
	 
	 System.out.println("LoginController.Authenticate()");

	loginbean.setUsername("muni");

	
	
	
}
	

}
