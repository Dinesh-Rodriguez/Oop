import java.util.ArrayList;
import java.util.List;


// A list to hold LibraryItem objects.
public class Library {
    private List<LibraryItem> items;

    public Library() {
        this.items = new ArrayList<>();
    }

    // methods to add items to the library and retrieve details
    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public List<String> getAllItems() {
        List<String> details = new ArrayList<>();
        for (LibraryItem item : items) {
            details.add(item.getItemDetails());
        }
        return details;
    }
}
