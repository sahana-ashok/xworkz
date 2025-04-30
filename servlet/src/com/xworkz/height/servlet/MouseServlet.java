package com.xworkz.height.servlet;

import sun.net.www.content.text.Generic;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns="/onion",loadOnStartup=1)
public class MouseServlet extends GenericServlet {
   public MouseServlet(){
        System.out.println("MouseServlet created by tomcat");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }
}
