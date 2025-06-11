package com.xworkz.weather.servlet;

import com.xworkz.weather.dto.WeatherDTO;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

public class WeatherServlet {


    @WebServlet(urlPatterns = "/bengaluru", loadOnStartup = 1)
    public class weatherServlet extends GenericServlet {


        @Override
        public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
            String location = servletRequest.getParameter("location");
            String capture = servletRequest.getParameter("capture");
            String temperature = servletRequest.getParameter("temperature");
            String record = servletRequest.getParameter("record");

            servletRequest.setAttribute("lc",location);
            servletRequest.setAttribute("ca",capture);
            servletRequest.setAttribute("tem",temperature);
            servletRequest.setAttribute("rc",record);


            WeatherDTO dto = new WeatherDTO();
            dto.setLocation(location);
            dto.setCapture(capture);
            dto.setTemperature(temperature);
            dto.setRecord(record);

            servletRequest.setAttribute("dto", dto);


            RequestDispatcher dispatcher = servletRequest.getRequestDispatcher("weatherResult.jsp");
            dispatcher.forward(servletRequest, servletResponse);



        }
    }
}
