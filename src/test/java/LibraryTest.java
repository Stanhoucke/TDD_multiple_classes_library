import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book;
    private Book book2;

    @Before
    public void before(){
        library = new Library();
        book = new Book("Dune", "Frank Herbert", "Fantasy");
        book2 = new Book("Inverting the Pyramid", "Jonathan Wilson", "History");
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
    public void hasEmptyTracker(){
        assertEquals(0, library.countTracker());
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

    @Test
    public void canRemoveBook(){
        library.addBook(book);
        library.addBook(book);
        library.removeBook();
        assertEquals(1, library.countBooks());
        assertEquals(book, library.removeBook());
    }

    @Test
    public void canTrackBooksByGenre(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book2);

        HashMap<String, Integer> tracker = library.getTracker();
        int genreCount = tracker.get(book.getGenre());
        int genre2Count = tracker.get(book2.getGenre());

        assertEquals(2, library.countTracker());
        assertEquals(2, genreCount);
        assertEquals(1, genre2Count);
    }

}
