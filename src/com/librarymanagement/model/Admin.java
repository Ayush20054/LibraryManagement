package com.librarymanagement.model;

public class Admin extends User {
    private final int adminId;
    private String role;
    public Admin(String name, String emailID, String mobileNumber, int age, String password, int adminId,String role ){
        super(name,emailID,mobileNumber,age,password);
        this.adminId=adminId;
        this.role=role;
    }

    public int getAdminId() {
        return adminId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
