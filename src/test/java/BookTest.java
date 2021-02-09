import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("Dune", "Frank Herbert", "Fantasy");
    }

    @Test
    public void hasTitle(){
        assertEquals("Dune", book.getTitle());
    }

}
