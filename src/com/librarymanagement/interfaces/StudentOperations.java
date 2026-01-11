package com.librarymanagement.interfaces;

import com.librarymanagement.model.Book;

public interface StudentOperations {

    void viewBooks();
    void searchBook(String keyword);
    void issueBook(int studentID, int bookID);
    void returnBook(int studentID, int bookID);
    void viewIssuedBooks(int studentID);

}
