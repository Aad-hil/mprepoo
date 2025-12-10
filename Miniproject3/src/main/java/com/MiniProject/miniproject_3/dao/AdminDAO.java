package com.MiniProject.miniproject_3.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.MiniProject.miniproject_3.util.DBConnection;

public class AdminDAO {

    public boolean validateAdmin(String username, String password) {
        boolean status = false;
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(
                 "SELECT * FROM admins WHERE username=? AND password=?")) {
            
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
