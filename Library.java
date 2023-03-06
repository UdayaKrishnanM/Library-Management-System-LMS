import java.lang.reflect.Array;
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook(Book book){
        books.remove(book);
    }

    public ArrayList<Book> getBooks(){
        return books;
    }


    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> searchResults = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                searchResults.add(book);
            }
        }
        return searchResults;
    }

    public ArrayList<Book> searchById(String Id){
            ArrayList<Book> searchResults = new ArrayList<>();
            for(Book book:books){
                if(book.getId().contains(Id)){
                    searchResults.add(book);
                }
            }
            return searchResults;
    }


    public ArrayList<Book> searchByAuthor(String author) {
        ArrayList<Book> searchResults = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                searchResults.add(book);
            }
        }
        return searchResults;
    }
    public void displayBooks() {
        System.out.println("Books left in the store:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book.toString());
            }
        }
    }

    public void printBooks(ArrayList<Book> books) {
        if (books.size() == 0) {
            System.out.println("No books found.");
        } else {
            System.out.println("Books found:");
            for (Book book : books) {
                System.out.println(book.toString());
            }
        }
    }

}
