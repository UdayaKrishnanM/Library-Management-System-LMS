public class Book {

    private String title;
    private String author;


    private String id;
    private boolean isAvailable;

    public Book(String title, String author, String id, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.id = id;
        this.isAvailable = isAvailable;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getId(){
        return id;
    }

    public void setAvailable(boolean available){
        isAvailable = available;
    }

    public boolean isAvailable(){
        return isAvailable;
    }


    @Override
    public String toString() {
        return "Title: "+ title + ",\t Author Name: "+ author+",\t Book ID: " +id+ ",\t available: " +isAvailable;
    }
}
