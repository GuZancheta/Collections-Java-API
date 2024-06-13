package main.list.search;

public class MainBook {

    public static void main(String[] args) {
        BookCatalog bookCatalog = new BookCatalog();

        bookCatalog.addBook("Book 1", "Author 1", 2020);
        bookCatalog.addBook("Book 2", "Author 1", 2015);
        bookCatalog.addBook("Book 3", "Author 2", 2008);
        bookCatalog.addBook("Book 3", "Author 2", 2008);
        bookCatalog.addBook("Book 4", "Author 3", 2010);

        System.out.println(bookCatalog.findByAuthor("Author 1"));
        System.out.println(bookCatalog.findByYearRange(2010, 2020));
        System.out.println(bookCatalog.findByTitle("Book 3"));
    }
}
