package com.librarymanagement.model;

import com.librarymanagement.exceptions.InvalidAgeInputException;
import com.librarymanagement.exceptions.InvalidEmailException;
import com.librarymanagement.exceptions.InvalidMobileNumberException;
import com.librarymanagement.exceptions.InvalidPasswordException;

public class User {
    private String name;
    private String emailID;
    private String mobileNumber;
    private int age;
    private String password;

   public User(String name, String emailID, String mobileNumber, int age, String password) {
        this.name = name;
        this.emailID = emailID;
        this.mobileNumber = mobileNumber;
        this.age = age;
        this.password = password;
    }

    // getter Methods
    public String getName() {
        return name;
    }
    public String getEmailID(){
        return emailID;
    }
    public String getMobileNumber(){
        return mobileNumber;
    }
    public int getAge(){
        return age;
    }

    // setter methods
    public void setName(String name){
        this.name=name;
    }
    public void setEmailID(String emailID)throws InvalidEmailException{
       if (emailID==null || !emailID.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")){
           throw new InvalidEmailException("Enter the valid Email Address");
       }
        this.emailID=emailID;
    }
    public void setAge(int age)throws InvalidAgeInputException{
       if (age<=0){
           throw  new InvalidAgeInputException("Age must be Greater than zero");
       }
        this.age=age;
    }
    public void setMobileNumber(String mobileNumber)throws InvalidMobileNumberException{
       if (mobileNumber==null ||!mobileNumber.matches("[0-9]{10}")){
           throw new InvalidMobileNumberException("Enter valid Mobile Number");
       }
        this.mobileNumber=mobileNumber;
    }
    public void setPassword(String password) throws InvalidPasswordException {

        if (password == null ||
                !password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%!^&*])[A-Za-z\\d@#$%!^&*]{8,}$")) {

            throw new InvalidPasswordException("Enter valid password");
        }

        this.password = password;
    }

}
