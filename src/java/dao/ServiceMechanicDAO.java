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
import models.ServiceMechanic;
import utils.MyConnection;

/**
 *
 * @author Admin_Coder
 */
public class ServiceMechanicDAO {

    MyConnection con = new MyConnection();

    public List<ServiceMechanic> getList() {

        List<ServiceMechanic> list = new ArrayList<>();
        String sql = "SELECT TOP (1000) [serviceTicketID]\n"
                + "      ,[serviceID]\n"
                + "      ,[mechanicID]\n"
                + "      ,[hours]\n"
                + "      ,[comment]\n"
                + "      ,[rate]\n"
                + "  FROM [Car_Dealership].[dbo].[ServiceMehanic]";
        try {
            PreparedStatement st = con.getConnection().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new ServiceMechanic(rs.getInt("serviceTicketID"),
                        rs.getInt("serviceID"),
                        rs.getString("mechanicID"),
                        rs.getInt("hours"),
                        rs.getString("comment"),
                        rs.getString("rate")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void updateServiceMechanic(ServiceMechanic sm) {
        String sql = "UPDATE ServiceMehanic\n"
                + "                SET [hours] = ?, [comment] = ?, [rate] = ?\n"
                + "                WHERE [serviceTicketID] = ? AND [serviceID] = ?";
        try {
            PreparedStatement st = con.getConnection().prepareStatement(sql);
            st.setInt(1, sm.getHours());
            st.setString(2, sm.getComment());
            st.setString(3, sm.getRate());
            st.setInt(4, sm.getServiceTicketID());
            st.setInt(5, sm.getServiceID());
            st.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ServiceMechanic getServiceMechanicByID(int serviceTicketID, int serviceID) {
        String sql = "SELECT [serviceTicketID]\n"
                + "                     ,[serviceID]\n"
                + "                     ,[mechanicID]\n"
                + "                     ,[hours]\n"
                + "                     ,[comment]\n"
                + "                     ,[rate]\n"
                + "                 FROM [Car_Dealership].[dbo].[ServiceMehanic]\n"
                + "		    WHERE [serviceTicketID] = ? AND [serviceID] = ?";
        try {
            PreparedStatement st = con.getConnection().prepareStatement(sql);
            st.setInt(1, serviceTicketID);
            st.setInt(2, serviceID);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                return new ServiceMechanic(
                        rs.getInt("serviceTicketID"),
                        rs.getInt("serviceID"),
                        rs.getString("mechanicID"),
                        rs.getInt("hours"),
                        rs.getString("comment"),
                        rs.getString("rate")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
