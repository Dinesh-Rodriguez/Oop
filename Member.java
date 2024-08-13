// subclass Member of User
public class Member extends User {

    public Member(String name) {
        super(name);
    }
    
    // methods for borrowing and returning books.
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
