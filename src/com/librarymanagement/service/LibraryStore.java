package com.librarymanagement.service;

import com.librarymanagement.model.Book;
import com.librarymanagement.model.IssuedBookRecord;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibraryStore {
    public static Map<Integer, Book> books = new HashMap<>();
    public static List<IssuedBookRecord> issueBooks = new ArrayList<>();
}
