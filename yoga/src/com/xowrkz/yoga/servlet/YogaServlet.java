package com.xowrkz.yoga.servlet;

import com.xowrkz.yoga.dto.YogaDTO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/yoga", loadOnStartup = 1)
public class YogaServlet extends HttpServlet {

    public YogaServlet(){
        System.out.println("no-arg const");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String name=req.getParameter("name");
    String age=req.getParameter("age");
//    String phoneNumber = req.getParameter("phoneNumber");
//        long phoneNumber1 =  Long.parseLong(phoneNumber);
//

        int age1 = Integer.parseInt(age);

        YogaDTO yogaDTO = new YogaDTO(name,age);
        System.out.println("Name="+name+"Age="+age);

        req.setAttribute("dto",yogaDTO);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("yogaResult.jsp");
        requestDispatcher.forward(req,resp);
    }

}

