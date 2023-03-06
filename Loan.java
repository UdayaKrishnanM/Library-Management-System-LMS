public class Loan {

    private User user;
    private Book book;
    private String givenDate;
    private String returnDate;

    public Loan(User user, Book book, String giveDate, String returnDate) {
        this.user = user;
        this.book = book;
        this.givenDate = giveDate;
        this.returnDate = returnDate;
    }

    public User getUser() {
        return user;
    }

    public Book getBook() {
        return book;
    }

    public String getGivenDate() {
        return givenDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "User: "+user.getName() +",\t Book: "+ book.getTitle()+",\t Get Date: " + givenDate +",\t Return Date: "+ returnDate;
    }

}
