import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> books;

    public Library() {
        this.capacity = 3;
        this.books = new ArrayList<Book>();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public ArrayList<Book> getBooks() {
        return this.books;
    }

    public int countBooks() {
        return this.books.size();
    }
}
