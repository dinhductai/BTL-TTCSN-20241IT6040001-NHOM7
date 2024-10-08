package com.example.ProjectLaptopStore.DTO;

import java.util.Date;

public class Customer_CountNewCustomerDTO {
    private String nameCustomer;
    private String fullAddressOfCustomer;
    private String emailCustomer;
    private String phoneCustomer;
    private Date dateRegisterOfCustomer;

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getFullAddressOfCustomer() {
        return fullAddressOfCustomer;
    }

    public void setFullAddressOfCustomer(String fullAddressOfCustomer) {
        this.fullAddressOfCustomer = fullAddressOfCustomer;
    }

    public String getEmailCustomer() {
        return emailCustomer;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }

    public String getPhoneCustomer() {
        return phoneCustomer;
    }

    public void setPhoneCustomer(String phoneCustomer) {
        this.phoneCustomer = phoneCustomer;
    }

    public Date getDateRegisterOfCustomer() {
        return dateRegisterOfCustomer;
    }

    public void setDateRegisterOfCustomer(Date dateRegisterOfCustomer) {
        this.dateRegisterOfCustomer = dateRegisterOfCustomer;
    }
}
