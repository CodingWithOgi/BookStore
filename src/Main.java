import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        System.out.println("How many books will you add in the library?");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        BookStore s = new BookStore();
        List<Book> l = s.getBooks();
        for(int i=0;i<n;i++){
            Book b;
            System.out.println("What type is the book?");
            String type = sc.nextLine();
            switch(type){
                case "CHILDREN": b = new ChildrenBook();
                case "COMIC": b = new ComicBook();
                default: b = new Book();
            }
            System.out.println("What is the book called?");
            String title = sc.nextLine();
            b.setTitle(title);
            System.out.println("Who is its author?");
            String name = sc.nextLine();
            b.setAuthor(name);
            System.out.println("What price is the book?");
            double price = sc.nextInt();
            b.setPrice(price);
            System.out.println("How many copies of this book do you have?");
            int available = sc.nextInt();
            b.setAvailable(available);

        }

    }


}
