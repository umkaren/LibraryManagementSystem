import java.util.ArrayList;
import java.util.List;

public class LibraryManager<T extends LibraryItem> implements LibraryOperations<T> {
    private List<T> items;

    public LibraryManager() {
        items = new ArrayList<>();
    }

    @Override
    public void addItem(T item) {
        if (items.contains(item)) {
            System.out.println(item.getItemType() + " is already in the collection.");
        } else {
            items.add(item);
            System.out.println(item.getItemType() + " added to collection.");
        }
    }

    @Override
    public void removeItem(T item) {
        if (items.remove(item)) {
            System.out.println(item.getItemType() + " removed from collection.");
        } else {
            System.out.println("Invalid request. Item is not in the current collection.");
        }
    }

    @Override
    public void displayItems() {
        System.out.println("Library collection: ");
        if (items.isEmpty()) {
            System.out.println("There is nothing in the collection. Please add items.");
        } else {
            for (T item : items) {
                System.out.println(item.getItemDetails());
            }
        }
    }
}
