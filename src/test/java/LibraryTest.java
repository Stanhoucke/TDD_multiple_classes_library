import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library();
        book = new Book("Dune", "Frank Herbert", "Fantasy");
    }

    @Test
    public void hasCapacity3(){
        assertEquals(3, library.getCapacity());
    }

    @Test
    public void hasZeroBooks(){
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void doesNotAddBooksIfAtCapacity(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(3, library.countBooks());
    }

}
