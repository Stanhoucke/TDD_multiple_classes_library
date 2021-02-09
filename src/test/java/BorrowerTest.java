import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book;

    @Before
    public void before(){
        borrower = new Borrower("Paul");
        book = new Book("Dune", "Frank Herbert", "Fantasy");
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

}
