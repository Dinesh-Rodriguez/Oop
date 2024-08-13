public abstract class User {
    private String name;  // private attribute for the user’s name.

    // constructor to initialize the user’s name.
    public User(String name) {
        this.name = name;
    }

    // an abstract method for managing books
    public abstract String manageBooks(Book book, String action);
}
