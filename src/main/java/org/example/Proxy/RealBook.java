package org.example.Proxy;

public class RealBook implements Book {
    private String bookTitle;

    public RealBook(String bookTitle){
        this.bookTitle = bookTitle;
    }

    public String read(){
        return "Reading " + bookTitle;
    }
}
