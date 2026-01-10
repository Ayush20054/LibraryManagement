package com.librarymanagement.exceptions;

public class InvalidEmailException extends Exception{
    public InvalidEmailException(String message){
        super(message);
    }
}

