
package assignmentp2;

import java.util.*;

public class LibraryManager {
    private ArrayList<Book> books = new ArrayList<>();

    //Method used to add book
    public void addBook(Book book) {
        books.add(book);
    }
    
    //Method used to search for a book
    public Book searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title))
                return book;
        }
        return null;
    }

    //Method used to change if a book is available or not
    public boolean updateBookAvailability(int id, boolean newAvailability) {
        for (Book book : books) {
            if (book.getId() == id) {
                book.setAvailable(newAvailability);
                return true;
            }
        }
        return false;
    }

    //Method used to remove book
    public boolean deleteBook(int id) {
        return books.removeIf(book -> book.getId() == id);
    }

    public void printReport() {
        if (books.isEmpty()) {
            System.out.println("No books found.");
            return;
        }

        System.out.println("=== Library Report ===");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}