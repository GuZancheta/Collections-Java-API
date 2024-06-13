package main.list.search;

import java.util.ArrayList;
import java.util.List;

public class BookCatalog {

    private List<Book> books = new ArrayList<>();

    public void addBook(String title, String author, int yearPublication) {
        books.add(new Book(title, author, yearPublication));
    }

    public List<Book> findByAuthor(String author) {
        return books.stream().filter(book -> author.equalsIgnoreCase(book.getAuthor())).toList();
    }

    public List<Book> findByYearRange(int startingYear, int finalYear) {
        return books.stream().filter(book -> book.getYearPublication() >= startingYear && book.getYearPublication() <= finalYear).toList();
    }

    public Book findByTitle(String title) {
        return books.stream().filter(book -> title.equalsIgnoreCase(book.getTitle())).findFirst().orElse(null);
    }
}