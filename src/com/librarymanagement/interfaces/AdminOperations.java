package com.librarymanagement.interfaces;

import com.librarymanagement.model.Book;

import java.time.LocalDate;

public interface AdminOperations {
    void viewAllBooks();
    void addBook(Book book);
    void removeBook(int bookID);
    void viewBorrowedBooksWithStudentDetails();
    void viewLateStudents(LocalDate currentDate);
}
