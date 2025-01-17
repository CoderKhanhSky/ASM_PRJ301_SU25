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

    MyConnection cn = new MyConnection();

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
            PreparedStatement st = cn.getConnection().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                
                list.add(new ServiceMechanic(rs.getInt("serviceTicketID"),
                        rs.getInt("serviceID"),
                        rs.getBigDecimal("mechanicID"),
                        rs.getInt("hours"),
                        rs.getString("comment"),
                        new BigDecimal(rs.getBigDecimal("rate").stripTrailingZeros().toPlainString())));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
