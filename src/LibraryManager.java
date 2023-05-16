import java.util.ArrayList;
import java.util.List;

public class LibraryManager<T extends LibraryItem> implements LibraryOperations<T> {
    private List<T> items;

    public LibraryManager() {
        items = new ArrayList<>();
    }

    @Override
    public void addItem(T item) {
        items.add(item);
        System.out.println(item.getItemType() + " added to collection.");
    }

    @Override
    public void removeItem(T item) {
        if (items.remove(item)) {
            System.out.println(item.getItemType() + " removed from collection.") ;
        }
    }

    @Override
    public void displayItems() {
        System.out.println("Library collection: ");
        for (T item : items) {
            System.out.println(item.getItemDetails());
        }
    }
}
