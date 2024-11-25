package com.jdc.mvc.initializer;

import java.util.Set;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.servlet.DispatcherServlet;

public class MvcAppInitializer  implements ServletContainerInitializer{

	@Override
	public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
		//Register DispatcherServlet
		
		var dispatcher = new DispatcherServlet();
		dispatcher.setContextConfigLocation("/WEB-INF/mvc-config.xml");
		var servlet = ctx.addServlet("dispatcher", dispatcher);
		servlet.setLoadOnStartup(1);
		
		//Map Servlet
		servlet.addMapping("/");
		
		//Set Context Parameter
		ctx.setInitParameter("contextConfigLocation", "/WEB-INF/root-config.xml");
		
		//Application Context
		var contextLoader = new ContextLoaderListener();
		ctx.addListener(contextLoader);
		
	}

}
