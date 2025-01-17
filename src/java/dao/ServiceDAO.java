/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.Service;
import utils.MyConnection;

/**
 *
 * @author Admin_Coder
 */
public class ServiceDAO {

    MyConnection con = new MyConnection();

    public List<Service> getList() {
        List<Service> list = new ArrayList<>();
        try {
            String sql = "SELECT TOP (1000) [serviceID]\n"
                    + "      ,[serviceName]\n"
                    + "      ,[hourlyRate]\n"
                    + "  FROM [Car_Dealership].[dbo].[Service]\n"
                    + "  WHERE [Status] = 'Active';";
            PreparedStatement st = con.getConnection().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new Service(rs.getInt("serviceID"),
                        rs.getString("serviceName"),
                        new BigDecimal(rs.getBigDecimal("hourlyRate").stripTrailingZeros().toPlainString())));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public void deleteService(int serviceID) {
        String sql = "UPDATE Service\n"
                + "SET Status = 'Deactive'\n"
                + "WHERE serviceID = ?";
        try {
            PreparedStatement st = con.getConnection().prepareStatement(sql);
            st.setInt(1, serviceID);
            st.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateService(Service s) {
        String sql = "UPDATE Service \n"
                + "  SET [serviceName] = ? , [hourlyRate] = ?\n"
                + "  WHERE [serviceID] = ?";
        try {
            PreparedStatement st = con.getConnection().prepareStatement(sql);
            st.setString(1, s.getServiceName());
            st.setBigDecimal(2, s.getHourlyRate());
            st.setInt(3, s.getServiceID());
            st.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Service getServiceByID(int serviceID) {
        String sql = "SELECT [serviceID], [serviceName], [hourlyRate] FROM Service WHERE serviceID = ?";
        try {
            PreparedStatement st = con.getConnection().prepareStatement(sql);
            st.setInt(1, serviceID);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                return new Service(rs.getInt("serviceID"),
                        rs.getString("serviceName"),
                        new BigDecimal(rs.getBigDecimal("hourlyRate").stripTrailingZeros().toPlainString()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void addService(Service s) {
        String sql = "INSERT INTO Service (serviceID, serviceName, hourlyRate)\n"
                + "VALUES (?,?,?)";
        try {
            PreparedStatement st = con.getConnection().prepareStatement(sql);
            st.setInt(1, s.getServiceID());
            st.setString(2, s.getServiceName());
            st.setBigDecimal(3, s.getHourlyRate());
            st.executeUpdate();
        } catch (Exception e) {
        }
    }
}
