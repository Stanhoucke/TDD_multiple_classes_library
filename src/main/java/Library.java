import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private int capacity;
    private ArrayList<Book> books;
    private HashMap<String, Integer> tracker;

    public Library() {
        this.capacity = 3;
        this.books = new ArrayList<Book>();
        this.tracker = new HashMap<String, Integer>();
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

    public void addBook(Book book) {
        if(this.countBooks() < this.capacity){
            this.books.add(book);
            this.trackBook(book);
        }
    }

    public Book removeBook() {
        return this.books.remove(0);
    }

    public int countTracker() {
        return this.tracker.size();
    }

    public void trackBook(Book book){
        this.tracker.put(book.getGenre(), 1);
    }
}
