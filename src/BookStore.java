import java.util.List;

public class BookStore {
    List<Book> books;
    public List<Book> findBooksByAuthor(String name){
        ....;
    }
    void sell(Book b){
        int n=b.getAvailable();
        b.setAvailable(n-1);
        System.out.println("The book " + b.getTitle() + "has been sold");
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
