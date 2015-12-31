//package com.du.doom.loader;
//
//import org.springframework.web.WebApplicationInitializer;
//import org.springframework.web.servlet.DispatcherServlet;
//
//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRegistration;
//
///**
// * author shenxf
// * date: 2015/12/20.
// */
//public class DoomWebApplicationInitializer implements WebApplicationInitializer {
//
//
//    public void onStartup(ServletContext container) throws ServletException {
//
//        ServletRegistration.Dynamic registration = container.addServlet("dispatcher", new DispatcherServlet());
//        registration.setLoadOnStartup(1);
//        registration.addMapping("/*");
//
//    }
//}
