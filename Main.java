import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        //Scanner class
        Scanner in = new Scanner(System.in);

        //Create books
        Book book1 = new Book("Harry Potter and the Chambers of Secret", "J.K. Rowling","1",true);
        Book book2 = new Book("Rich Dad, Poor Dad", "Robert Kiyosaki","2",true);
        Book book3 = new Book("Harry Potter and the Socerer Stone", "J.K. Rowling","3",true);
        Book book4 = new Book("Java and the Foundation", "Balamurugan","4",true);
        Book book5 = new Book("Python Crash Course", "Luciano","54",true);


        //Create a library and add the books
        Library lib=new Library();
        lib.addBook(book1);
        lib.addBook(book2);
        lib.addBook(book3);
        lib.addBook(book4);
        lib.addBook(book5);


        lib.displayBooks();

        System.out.println();
        System.out.println("Press 1 to search with Title......");
        System.out.println("Press 2 to search with Author Name......");
        System.out.println("Press 3 to search with Id......");
        System.out.println();

        int number=in.nextInt();
        if(number==1) {
            System.out.println("Enter the Title name of the book you want.....");
            //consuming the <enter> from the input above
            in.nextLine();
            String res = in.nextLine();
            ArrayList<Book> result = lib.searchByTitle(res);
            lib.printBooks(result);
        }
        else if(number==2){
            System.out.println("Enter the Author name of the book you want.....");
            in.nextLine();
            String res = in.nextLine();
            ArrayList<Book> searchres = lib.searchByAuthor(res);
            lib.printBooks(searchres);
        }
        else if(number==3){
            System.out.println("Enter the ID of the book you want.....");
            in.nextLine();
            String res = in.nextLine();
            ArrayList<Book> searchresult = lib.searchById(res);
            lib.printBooks(searchresult);
        }

        System.out.println();

        //Create a user and lend a book to them

        User user = new User("Udaya Krishnan","abcd@gmail.com","123");
        Loan loan = new Loan(user,book1,"08-03-2023","28-03-2023");
        book1.setAvailable(false);
        System.out.println(loan.toString());

    }




}
