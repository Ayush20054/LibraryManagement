package com.librarymanagement.service;

import com.librarymanagement.interfaces.AdminOperations;
import com.librarymanagement.model.Book;
import com.librarymanagement.model.IssuedBookRecord;

import java.time.LocalDate;

public class AdminService implements AdminOperations {
    @Override
    public void viewAllBooks() {
        if (LibraryStore.books.isEmpty()){
            System.out.println("No books Available in Library");
            return;
        }
    for (Book book : LibraryStore.books.values()){
        if (book.getQuantity()>0){
            System.out.println(book.getBookName()+"|"+
                    book.getBookId()+"|"+
                    book.getAuthorName()+"|"+
                    book.getLanguage()+"|"+
                    book.getTopic()+"|"+
                    book.getSubject()+"|"+
                    book.getAgeRecommendation()+"|"+
                    book.getBriefInfo()+"|"+
                    book.getQuantity());

        }
    }
    }

    @Override
    public void addBook(Book book) {

       if (LibraryStore.books.containsKey(book.getBookId())){
           System.out.println("The Book is already Available in Storage");
           return;
       }
       LibraryStore.books.put(book.getBookId(), book);
        System.out.println("Book is Added Successfully!!");

    }

    @Override
    public void removeBook(int bookID) {
        if (!LibraryStore.books.containsKey(bookID)){
            System.out.println("Book ID "+bookID+" not found");
            return;
        }
        LibraryStore.books.remove(bookID);
        System.out.println("Book with ID "+bookID+" is removed successfully");
    }

    @Override
    public void viewBorrowedBooksWithStudentDetails() {
        if (LibraryStore.issueBooks.isEmpty()){
            System.out.println("No Books Are Issued ");
            return;
        }
        boolean found = false;
    for (IssuedBookRecord record : LibraryStore.issueBooks){
        Book book = LibraryStore.books.get(record.getBookId());
        if (book!=null) {
            System.out.println(record.getStudentId() + "|" +
                    record.getBookId() + "|" +
                    book.getBookName() + "|" +
                    book.getAuthorName());
            found=true;
        }
    }
    if (!found){
        System.out.println("No Valid borrowed book detail available ");
    }
    }

    @Override
    public void viewLateStudents(LocalDate currentDate) {

    }
}
