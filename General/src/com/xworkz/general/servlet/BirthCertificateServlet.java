package com.xworkz.general.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.xworkz.general.dto.BirthCertificateDTO;
import java.io.IOException;

    @WebServlet("/birth")
    public class BirthCertificateServlet extends HttpServlet {
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            BirthCertificateDTO dto = new BirthCertificateDTO();
            dto.setBirthId(req.getParameter("birthId"));
            dto.setHospitalName(req.getParameter("hospitalName"));
            dto.setFatherName(req.getParameter("fatherName"));
            dto.setMotherName(req.getParameter("motherName"));
            dto.setDateTime(req.getParameter("dateTime"));
            dto.setDoctorName(req.getParameter("doctorName"));
            dto.setNurseName(req.getParameter("nurseName"));
            dto.setHospitalType(req.getParameter("hospitalType"));

            req.setAttribute("dto", dto);
            req.getRequestDispatcher("birthCertificateResult.jsp").forward(req, resp);
        }
    }

