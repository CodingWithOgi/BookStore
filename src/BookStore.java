import java.util.List;

public class BookStore {
    List<Book> books;
    void sell(Book b){
        int n=b.getAvailables();
        b.setAvailables(n-1);
        System.out.println("Продадоха книгата " + b.getTitle());
    }
}
