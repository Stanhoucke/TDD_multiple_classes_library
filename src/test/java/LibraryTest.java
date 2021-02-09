import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;

    @Before
    public void before(){
        library = new Library();
    }

    @Test
    public void hasCapacity3(){
        assertEquals(3, library.getCapacity());
    }

    @Test
    public void hasZeroBooks(){
        assertEquals(0, library.countBooks());
    }

}
