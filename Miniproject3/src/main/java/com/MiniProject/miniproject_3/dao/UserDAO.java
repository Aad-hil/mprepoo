package com.MiniProject.miniproject_3.dao;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.MiniProject.miniproject_3.util.DBConnection;

public class UserDAO {

    public boolean registerUser(String username, String password, String email) {
        boolean status = false;
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(
                 "INSERT INTO users(username,password,email) VALUES(?,?,?)")) {
            
            ps.setString(1, username);
            ps.setString(2, password); 
            ps.setString(3, email);
            int rows = ps.executeUpdate();
            status = rows > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    public boolean validateUser(String username, String password) {
        boolean status = false;
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(
                 "SELECT * FROM users WHERE username=? AND password=?")) {
            
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            status = rs.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
}
