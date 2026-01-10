package com.librarymanagement.model;

import com.librarymanagement.exceptions.InvalidAgeInputException;
import com.librarymanagement.exceptions.InvalidQuantityInputException;

public class Book {
    private final int bookId;
    private String bookName;
    private String authorName;
    private String language;

    private String topic;
    private String subject;

    private int ageRecommendation;
    private int quantity;

    private String briefInfo;

   public Book(int bookId,String bookName, String authorName, String language, String topic, String subject,int ageRecommendation,int quantity,String briefInfo){
        this.bookId=bookId;
        this.bookName=bookName;
        this.authorName=authorName;
        this.language=language;
        this.topic=topic;
        this.subject=subject;
        this.ageRecommendation=ageRecommendation;
        this.quantity=quantity;
        this.briefInfo=briefInfo;
    }
    // getter Methods
    public int getBookId(){
       return bookId;
    }
    public String getBookName(){
       return bookName;
    }
    public String getAuthorName(){
       return authorName;
    }
    public String getLanguage(){
       return language;
    }
    public String getTopic(){
       return topic;
    }
    public String getSubject(){
       return subject;
    }
    public int getAgeRecommendation(){
       return ageRecommendation;
    }
    public int getQuantity(){
       return  quantity;
    }
    public String getBriefInfo(){
       return briefInfo;
    }

    // setter methods

    public void setBookName(String bookName){
        this.bookName=bookName;
    }
    public void setAuthorName(String authorName){
        this.authorName=authorName;
    }
    public void setLanguage(String language){
        this.language=language;
    }
    public void setTopic(String topic){
        this.topic=topic;
    }
    public void setSubject(String subject){
        this.subject=subject;
    }
    public void setAgeRecommendation(int ageRecommendation)throws InvalidAgeInputException{
            if (ageRecommendation <= 0) {
                throw new InvalidAgeInputException("Age Must be greater than Zero");
            }
            this.ageRecommendation = ageRecommendation;
        }

    public void setQuantity(int quantity)throws InvalidQuantityInputException{
       if (quantity<=0){
           throw new InvalidQuantityInputException("Quantity Must be greater than Zero");
       }
           this.quantity = quantity;
       }

    public void setBriefInfo(String briefInfo){
        this.briefInfo=briefInfo;
    }




}
