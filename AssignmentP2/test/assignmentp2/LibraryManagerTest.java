
package assignmentp2;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryManagerTest {

    private LibraryManager manager;

    @BeforeEach
    void setUp() {
        manager = new LibraryManager();
        manager.addBook(new FictionBook(1, "Harry Potter", true));
        manager.addBook(new nonFictionBook(2, "Sapiens", true));
    }

    @Test
    void testAddAndSearchBook() {
        Book b = manager.searchBook("Harry Potter");
        assertNotNull(b);
        assertEquals("Harry Potter", b.getTitle());
    }

    @Test
    void testSearchBook_NotFound() {
        assertNull(manager.searchBook("Unknown Book"));
    }

    @Test
    void testUpdateBookAvailability() {
        assertTrue(manager.updateBookAvailability(1, false));
        assertFalse(manager.searchBook("Harry Potter").isAvailable());
    }

    @Test
    void testUpdateBookAvailability_NotFound() {
        assertFalse(manager.updateBookAvailability(99, false));
    }

    @Test
    void testDeleteBook() {
        assertTrue(manager.deleteBook(2));
        assertNull(manager.searchBook("Sapiens"));
    }

    @Test
    void testDeleteBook_NotFound() {
        assertFalse(manager.deleteBook(999));
    }
}
