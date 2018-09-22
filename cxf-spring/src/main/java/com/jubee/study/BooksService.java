package com.jubee.study;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

public class BooksService {

    private BooksResource booksService;

    public BooksService(BooksResource booksResource) {
        this.booksService = booksResource;
    }

    @GET
    @Path("/name/")
    public String bookName() {
        return booksService.getBookName();
    }
}
