import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        System.out.println("Въедете броя книги:");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        BookStore s = new BookStore();
        List<Book> l = s.getBooks();
        for(int i=0;i<n;i++){
            System.out.println("Въведете тип на книгата:");
            String type = sc.nextLine();
            System.out.println("Въведете цена на книгата:");
            double price = sc.nextInt();
        }

    }


}
