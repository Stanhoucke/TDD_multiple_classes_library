import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book;
    private Library library;

    @Before
    public void before(){
        borrower = new Borrower("Paul");
        book = new Book("Dune", "Frank Herbert", "Fantasy");
        library = new Library();

        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
    }

    @Test
    public void hasName(){
        assertEquals("Paul", borrower.getName());
    }

    @Test
    public void hasEmptyCollection(){
        assertEquals(0, borrower.countCollection());
    }

    @Test
    public void canAddBookToCollection(){
        borrower.addBook(book);
        assertEquals(1, borrower.countCollection());
    }

    @Test
    public void canBorrowBookFromLibrary(){
        borrower.borrowBookFromLibrary(library);
        assertEquals(1, borrower.countCollection());
        assertEquals(2, library.countBooks());
    }

}
