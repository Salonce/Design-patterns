package org.example.Proxy;

public class ProxyBook implements Book {

    private RealBook realBook;
    private String bookTitle;

    public ProxyBook(String bookTitle){
        this.bookTitle = bookTitle;
    }

    @Override
    public String read() {
        StringBuilder sb = new StringBuilder();
        if (this.realBook == null) {
            sb.append("Loading " + bookTitle + "...");
            sb.append("\n");
            this.realBook = new RealBook(bookTitle);
        }
        sb.append(realBook.read());
        return sb.toString();
    }
}
