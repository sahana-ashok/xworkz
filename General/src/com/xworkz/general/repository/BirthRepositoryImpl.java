package com.xworkz.general.repository;

import com.xworkz.general.dto.BirthCertificateDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BirthRepositoryImpl implements BirthRepository{
    @Override
    public String save(BirthCertificateDTO birthDTO) {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="mysql://localhost:3306/birthdb";
            String username="root";
            String password="Xworkzodc@123";
            Connection connection = DriverManager.getConnection(url,username,password);

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

        return "false";
    }

}