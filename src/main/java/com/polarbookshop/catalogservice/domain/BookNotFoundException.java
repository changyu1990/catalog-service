package com.polarbookshop.catalogservice.domain;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(String isbn) {
        super("Could not find book with ISBN: " + isbn);
    }
}
