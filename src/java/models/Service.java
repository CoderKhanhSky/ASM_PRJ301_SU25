/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.math.BigDecimal;

/**
 *
 * @author Admin_Coder
 */
public class Service {
    private int serviceID;
    private String serviceName;
    private BigDecimal hourlyRate;

    public Service() {
    }

    public Service(int serviceID, String serviceName, BigDecimal hourlyRate) {
        this.serviceID = serviceID;
        this.serviceName = serviceName;
        this.hourlyRate = hourlyRate;
    }

    public int getServiceID() {
        return serviceID;
    }

    public void setServiceID(int serviceID) {
        this.serviceID = serviceID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public BigDecimal getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(BigDecimal hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
   
    
}
