package com.xworkz.general.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.general.dto.DeathCertificateDTO;

import java.io.IOException;


    @WebServlet("/death")
    public class DeathCertificateServlet extends HttpServlet {
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            DeathCertificateDTO dto = new DeathCertificateDTO();
            dto.setName(req.getParameter("name"));
            dto.setCause(req.getParameter("cause"));
            dto.setDate(req.getParameter("date"));
            dto.setTime(req.getParameter("time"));
            dto.setAgeAtDeath(req.getParameter("ageAtDeath"));
            dto.setCertifiedBy(req.getParameter("certifiedBy"));
            dto.setHospitalName(req.getParameter("hospitalName"));
            dto.setMannerOfDeath(req.getParameter("mannerOfDeath"));
            dto.setGender(req.getParameter("gender"));
            dto.setMarks(req.getParameter("marks"));

            req.setAttribute("dto", dto);
            req.getRequestDispatcher("deathCertificateResult.jsp").forward(req, resp);
        }
    }

