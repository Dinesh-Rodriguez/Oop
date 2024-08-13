public class LibraryManagementSystem {
    public static void main(String[] args) {

        Book book1 = new Book("Data Structure Algorithm", "Dinesh", "1234"); // book objects
        Book book2 = new Book("Java oop", "Asfak", "5678");

        BookItem bookItem1 = new BookItem(book1);  // Create BookItem objects
        BookItem bookItem2 = new BookItem(book2);

        Library library = new Library();

        library.addItem(bookItem1); // Add books to the library
        library.addItem(bookItem2);

        Librarian librarian = new Librarian("Mrs. Vajith");   // Create users
        Member member = new Member("Virat kholi");

        System.out.println(librarian.manageBooks(book1, "checkout"));

        System.out.println(member.manageBooks(book1, "return"));

        
        System.out.println(); // prints an empty line
        System.out.println("[Book Details]");



        for (String bookDetails : library.getAllItems()) {    // Display all books in the library
            System.out.println(bookDetails);
        }
    }
}
