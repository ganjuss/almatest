package Utilities;

import java.util.ArrayList;
import java.util.List;

import Bean.LoginBean;
import Bean.NavigationBean;
import Bean.SubNav;

public class Utility {

	public static List<NavigationBean> getNavigationBean(){
		List<NavigationBean> navigationList = new ArrayList<NavigationBean>();
		List<SubNav> subNavList = new ArrayList<SubNav>();
		List<SubNav> esubNavList = new ArrayList<SubNav>();
		List<SubNav> csubNavList = new ArrayList<SubNav>();
		List<SubNav> aboutusList = new ArrayList<SubNav>();
		List<SubNav> blogList = new ArrayList<SubNav>();
		List<SubNav> careerList = new ArrayList<SubNav>();


		LoginBean loginBean = new LoginBean();
		NavigationBean arts =new NavigationBean();
		NavigationBean events =new NavigationBean();
		NavigationBean competetions =new NavigationBean();
		NavigationBean aboutus =new NavigationBean();

		NavigationBean blog =new NavigationBean();
		NavigationBean careers =new NavigationBean();


		SubNav subNa=new SubNav();
		SubNav subNa1=new SubNav();
		SubNav subNa2=new SubNav();
		SubNav subNa3=new SubNav();

		SubNav subNa4=new SubNav();
		SubNav subNa5=new SubNav();

		subNa.setId("1");
		subNa.setNavLabel("Dance");
		subNa.setNavLink("#");
		subNavList.add(subNa);
		subNa1.setId("2");
		subNa1.setNavLabel("music");
		subNa1.setNavLink("#");
		subNavList.add(subNa1);
		subNa2.setId("3");
		subNa2.setNavLabel("music");
		subNa2.setNavLink("#");
		subNavList.add(subNa2);
		subNa3.setId("4");
		subNa3.setNavLabel("music");
		subNa3.setNavLink("#");
		subNavList.add(subNa3);
		subNa4.setId("5");
		subNa4.setNavLabel("music");
		subNa4.setNavLink("#");
		subNavList.add(subNa4);
		subNa5.setId("6");
		subNa5.setNavLabel("music");
		subNa5.setNavLink("#");
		subNavList.add(subNa5);
		arts.setSubNav(subNavList);
		arts.setId("arts");
		arts.setNavLabel("ARTS");
		navigationList.add(arts);



		SubNav csubNa=new SubNav();
		SubNav csubNa1=new SubNav();
		SubNav csubNa2=new SubNav();
		SubNav csubNa3=new SubNav();

		SubNav csubNa4=new SubNav();
		SubNav csubNa5=new SubNav();

		csubNa.setId("7");
		csubNa.setNavLabel("Dance");
		csubNa.setNavLink("#");
		csubNavList.add(csubNa);
		csubNa1.setId("8");
		csubNa1.setNavLabel("music");
		csubNa1.setNavLink("#");
		csubNavList.add(csubNa1);
		csubNa2.setId("9");
		csubNa2.setNavLabel("music");
		csubNa2.setNavLink("#");
		csubNavList.add(csubNa2);
		csubNa3.setId("10");
		csubNa3.setNavLabel("music");
		csubNa3.setNavLink("#");
		csubNavList.add(csubNa3);
		csubNa4.setId("11");
		csubNa4.setNavLabel("music");
		csubNa4.setNavLink("#");
		csubNavList.add(csubNa4);
		csubNa5.setId("12");
		csubNa5.setNavLabel("music");
		csubNa5.setNavLink("#");
		csubNavList.add(csubNa5);
		competetions.setSubNav(csubNavList);
		competetions.setId("events");
		competetions.setNavLabel("EVENTS");
		navigationList.add(competetions);
		SubNav AboutussubNa=new SubNav();
		AboutussubNa.setId("");
		AboutussubNa.setNavLabel("");
		AboutussubNa.setNavLink("");
aboutusList.add(AboutussubNa);
		aboutus.setSubNav(aboutusList);
		aboutus.setId("aboutus");
		aboutus.setNavLabel("ABOUT US");
		navigationList.add(aboutus);
		
		SubNav blogSubNa=new SubNav();
		blogSubNa.setId("");
		blogSubNa.setNavLabel("");
		blogSubNa.setNavLink("");
		blogList.add(blogSubNa);
		blog.setSubNav(blogList);
		blog.setId("blog");
		blog.setNavLabel("BLOG");
		navigationList.add(blog);
		
		SubNav careerSubNav=new SubNav();
		careerSubNav.setId("");
		careerSubNav.setNavLabel("");
		careerSubNav.setNavLink("");
		careerList.add(careerSubNav);
		careers.setSubNav(careerList);
		careers.setId("blog");
		careers.setNavLabel("BLOG");
		navigationList.add(careers);
		return navigationList;
	}
}	