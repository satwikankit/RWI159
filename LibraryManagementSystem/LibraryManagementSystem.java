
import java.util.*;


class LibraryManagementSystem {

    private Map<String, Book> books;

    public LibraryManagementSystem() {
        books = new HashMap<>();
    }

    public void addBook(Book book) {
        books.put(book.getTitle(), book);
    }

    public boolean isBookAvailable(String title) {
        return books.containsKey(title) && books.get(title).isAvailable();
    }

    public static void main(String[] args) {
        LibraryManagementSystem library = new LibraryManagementSystem();

        library.addBook(new Book("The Lord of the Rings", true));
        library.addBook(new Book("The Hobbit", false));
        library.addBook(new Book("The Silmarillion", true));

        System.out.println("Is The Lord of the Rings available? " + library.isBookAvailable("The Lord of the Rings"));
        System.out.println("Is The Hobbit available? " + library.isBookAvailable("The Hobbit"));
        System.out.println("Is The Silmarillion available? " + library.isBookAvailable("The Silmarillion"));
    }
}

class Book {

    private String title;
    private boolean available;

    public Book(String title, boolean available) {
        this.title = title;
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

