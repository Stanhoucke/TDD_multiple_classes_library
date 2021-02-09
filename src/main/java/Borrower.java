import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> collection;

    public Borrower(String name) {
        this.name = name;
        this.collection = new ArrayList<Book>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Book> getCollection() {
        return this.collection;
    }


    public int countCollection() {
        return this.collection.size();
    }

    public void addBook(Book book) {
        this.collection.add(book);
    }

    public void borrowBookFromLibrary(Library library) {
        Book book = library.removeBook();
        this.addBook(book);
    }
}
