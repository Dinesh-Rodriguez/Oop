// subclass Librarian of User
public class Librarian extends User {

    public Librarian(String name) {
        super(name);
    }

    // method to manage book actions
    @Override
    public String manageBooks(Book book, String action) {
        if (action.equals("checkout")) {
            return book.checkOut();
        } else if (action.equals("return")) {
            return book.returnBook();
        } else {
            return "Invalid action.";
        }
    }
}
