package com.librarymanagement.service;

import com.librarymanagement.exceptions.InvalidQuantityInputException;
import com.librarymanagement.interfaces.StudentOperations;
import com.librarymanagement.model.Book;
import com.librarymanagement.model.IssuedBookRecord;

public class StudentService implements StudentOperations {


    @Override
    public void viewBooks() {
        for (Book book : LibraryStore.books.values() ){
            if (book.getQuantity()>0) {
                System.out.println(book.getBookName() + "|"
                        + book.getBookId() + "|"
                        + book.getAuthorName() + "|"
                        + book.getLanguage() + "|" +
                        book.getSubject() + "|"
                        + book.getTopic() + "|"
                        + book.getAgeRecommendation() + "|"
                        + book.getBriefInfo() + "|"
                        + book.getQuantity());
                 }
        }

    }

    @Override
    public void searchBook(String keyword) {
        boolean isFound = false;
    for (Book book : LibraryStore.books.values()){
        if (book.getBookName().toLowerCase().contains(keyword.toLowerCase()) ||
        book.getAuthorName().toLowerCase().contains(keyword.toLowerCase())   ||
                book.getTopic().toLowerCase().contains(keyword.toLowerCase())||
                book.getSubject().toLowerCase().contains(keyword.toLowerCase())
        ){

            System.out.println(book.getBookName() + "|"
                    + book.getBookId() + "|"
                    + book.getAuthorName() + "|"
                    + book.getLanguage() + "|"
                    + book.getSubject() + "|"
                    + book.getTopic() + "|"
                    + book.getAgeRecommendation() + "|"
                    + book.getBriefInfo() + "|"
                    + book.getQuantity());
            isFound = true;
        }
    }
    if (!isFound){
        System.out.println("No Books are Available related to this "+keyword);
    }

    }

    @Override
    public void issueBook(int studentID, int bookID) {
    Book book = LibraryStore.books.get(bookID);
    if (book==null){
        System.out.println("Book with Id "+bookID+" not found");
        return;
    }

    if (book.getQuantity()<=0){
        System.out.println("Book is currently not Available");
        return;
    }
    try {
        book.setQuantity(book.getQuantity()-1);
    }catch (InvalidQuantityInputException e){
        System.out.println("Error while issuing Book "+e.getMessage());
    }
    LibraryStore.issueBooks.add(new IssuedBookRecord(studentID,bookID));
        System.out.println(
                "Book '" + book.getBookName() +
                        "' has been issued to student with ID " + studentID
        );


    }

    @Override
    public void returnBook(int studentID, int bookID) {
    Book book = LibraryStore.books.get(bookID);
    if (book==null){
        System.out.println("Book with Id "+bookID+" not found");
        return;
    }
        try {
            book.setQuantity(book.getQuantity()+1);
        }catch (InvalidQuantityInputException e){
            System.out.println("Error While returning Book "+e.getMessage());
        }
        System.out.println("Book' "+book.getBookName()+" has been Successfully returned by student with ID "+studentID);

    }

    @Override
    public void viewIssuedBooks(int studentID) {
    boolean found = false;
    for (IssuedBookRecord record : LibraryStore.issueBooks){
        if (record.getStudentId()==studentID){
            Book book = LibraryStore.books.get(record.getBookId());
            if (book!=null){
                System.out.println(book.getBookName()+"|"+
                        book.getBookId()+"|"+
                        book.getAuthorName());
                found=true;
            }

        }
    }
    if (!found){
        System.out.println("No Book issued to student with ID "+studentID);
    }
    }

}
