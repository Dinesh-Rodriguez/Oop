// BookItem that extends LibraryItem
public class BookItem extends LibraryItem {
    private Book book;

    public BookItem(Book book) {
        this.book = book;
    }
    // method to return the details of the book
    @Override
    public String getItemDetails() {
        return book.getDetails();
    }
}
