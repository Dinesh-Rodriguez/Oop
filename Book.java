public class Book {

   // private attributes for the book
    private String title;
    private String author;
    private String isbn;
    private boolean isCheckedOut;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isCheckedOut = false;
    }

    // methods to check out and return the book.
    public String checkOut() {
        if (!isCheckedOut) {
            isCheckedOut = true;
            return "The book '" + title + "' has been checked out.";
        }
        return "The book '" + title + "' is already checked out.";
    }

    public String returnBook() {
        if (isCheckedOut) {
            isCheckedOut = false;
            return "The book '" + title + "' has been returned.";
        }
        return "The book '" + title + "' was not checked out.";
    }

    // method to retrieve the book’s details
    public String getDetails() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Checked Out: " + isCheckedOut;
    }
}
