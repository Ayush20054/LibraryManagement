package com.librarymanagement.model;

public class Student extends User {
    private final int id;
    private String section;
    private String year;
    public Student(String name, String emailID, String mobileNumber, int age, String password,int id, String section,String year){
        super(name,emailID,mobileNumber,age,password);
        this.id=id;
        this.section=section;
        this.year=year;
    }

    public int getId() {
        return id;
    }

    public String getYear() {
        return year;
    }

    public String getSection() {
        return section;
    }
    // setter methods

    public void setYear(String year) {
        this.year = year;
    }

    public void setSection(String section) {
        this.section = section;
    }
}

