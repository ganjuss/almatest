package com.Controller;
import java.io.IOException;

import java.util.ArrayList;




import java.util.List;

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
import Utilities.SessionIdentifierGenerator;
import Utilities.Utility;

@RequestMapping("VIEW")
@Controller("loginController")

public class LoginController {

    
	
	

	String tokengenerated=null;

@RenderMapping
public ModelAndView Athenticate(final RenderRequest renderRequest, final RenderResponse renderResponse){
	
	ModelAndView modelAndView=new ModelAndView();
	Gson json = new Gson();
	List<NavigationBean> navigationList = new ArrayList<NavigationBean>();
	navigationList=Utility.getNavigationBean();
	SessionIdentifierGenerator session=new SessionIdentifierGenerator();
	tokengenerated=session.nextSessionId();
	
String navjson=json.toJson(navigationList.toArray(),NavigationBean[].class);
	System.out.println(navjson);
	
   LoginBean loginBean = new LoginBean();
	modelAndView.addObject("loginBean",loginBean);
	modelAndView.addObject("hi",navjson);
	modelAndView.addObject("token",tokengenerated);
	modelAndView.setViewName("login");
	return modelAndView;
	
}
@ActionMapping(params = "action=authenticate")
public void Authenticate(	
		@ModelAttribute(value = "loginBean") LoginBean loginBean, BindingResult bindingResult, final ActionRequest actionRequest, final ActionResponse actionResponse) throws IOException{
	Gson json = new Gson();
	String username=actionRequest.getParameter("name");
	String password=actionRequest.getParameter("password");
	String token=actionRequest.getParameter("token");
	LoginBean loginbean=new LoginBean();
	
	loginbean.setUsername(username);
	loginbean.setPassword(password);
	loginbean.setToken(token);
	System.out.println("generated token"+tokengenerated);
	System.out.println(loginbean.getToken());
	if(loginbean.getToken().equals(tokengenerated)){
		System.out.println("token matched");
	}
	String finalJson = json.toJson(loginbean,LoginBean.class);
	loginBean=json.fromJson(finalJson, LoginBean.class);
	
	System.out.println("username is "+loginBean.getUsername());
	System.out.println("password is "+loginBean.getPassword());
	 System.out.println("LoginController.Authenticate()");
	 HttpServletRequest httpServletRequest=PortalUtil.getHttpServletRequest(actionRequest);
	 String requesturl=httpServletRequest.getRequestURL().toString().replace(httpServletRequest.getRequestURI().toString(), "");
	 String responseUrl= requesturl+"/web/guest/muni";
System.out.println(requesturl + "hi " + responseUrl);	 
actionResponse.sendRedirect(responseUrl);
	
}

//@ActionMapping(params = "action=facebook")
//public ModelAndView helloFacebook(final ActionRequest actionRequest, final ActionResponse actionResponse) throws IOException {
//	ModelAndView modelAndView=new ModelAndView();
//    if (connectionRepository.findPrimaryConnection(Facebook.class) == null) {
//   	 HttpServletRequest httpServletRequest=PortalUtil.getHttpServletRequest(actionRequest);
//   	 String requesturl=httpServletRequest.getRequestURL().toString().replace(httpServletRequest.getRequestURI().toString(), "");
//   	 String responseUrl= requesturl+"/web/guest/muni";    
// 	actionResponse.sendRedirect(responseUrl);
//}
//
//    modelAndView.addObject("facebookProfile", facebook.userOperations().getUserProfile());
//    PagedList<Post> feed = facebook.feedOperations().getFeed();
//    modelAndView.addObject("feed", feed);
//    modelAndView.setView("profile");
//	return modelAndView;
//}
//public void facebookAuthenticate(	
//		@ModelAttribute(value = "fbLoginBean") LoginBean loginBean, BindingResult bindingResult, final ActionRequest actionRequest, final ActionResponse actionResponse) throws IOException{
//	Gson json = new Gson();
//
//	LoginBean loginbean=new LoginBean();
//	
//	loginbean.setUsername("");
//	
//	 HttpServletRequest httpServletRequest=PortalUtil.getHttpServletRequest(actionRequest);
//	 String requesturl=httpServletRequest.getRequestURL().toString().replace(httpServletRequest.getRequestURI().toString(), "");
//	 String responseUrl= requesturl+"/web/guest/muni";
//System.out.println(requesturl + "hi " + responseUrl);	 
//actionResponse.sendRedirect(responseUrl);
//	
//}
	

}
