package com.xowrkz.yoga.repository;

import com.xowrkz.yoga.dto.YogaDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class YogaRepositoryImpl implements YogaRepository{
    @Override
    public String save(YogaDTO yogaDTO) {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/yogadb";
            String username = "root";
            String password = "ashok_123#";

            Connection connection = DriverManager.getConnection(url, username, password);

            String sql = "insert into yoga_details values(0, '" + yogaDTO.getName() + "', '" + yogaDTO.getAge() + "')";


            Statement statement = connection.createStatement();

            statement.executeUpdate(sql);

            System.out.println(connection);
        }

        catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

        return "false";

    }
}
