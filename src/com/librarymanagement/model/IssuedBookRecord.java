package com.librarymanagement.model;

public class IssuedBookRecord {
    private int studentId;
    private int bookId;

    public IssuedBookRecord(int studentId, int bookId){
        this.studentId=studentId;
        this.bookId=bookId;
    }

    public int getBookId() {
        return bookId;
    }

    public int getStudentId() {
        return studentId;
    }
}
