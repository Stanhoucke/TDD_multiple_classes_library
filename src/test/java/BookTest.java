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

    @Test
    public void hasAuthor(){
        assertEquals("Frank Herbert", book.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("Fantasy", book.getGenre());
    }

}
