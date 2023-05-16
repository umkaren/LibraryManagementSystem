public class LibraryApp {
    public static void main(String[] args) {

        //instantiate books
        Book book1 = new Book("A Game of Thrones", 1996, "George R.R. Martin", "9780553593716");
        Book book2 = new Book("A Clash of Kings", 1998, "George R.R. Martin", "9780553579901");
        Book book3 = new Book("A Storm of Swords", 2000, "George R.R. Martin", "9780553381702");

        //instantiate DVDs
        DVD dvd1 = new DVD("The Lord of the Rings: The Fellowship of the Ring", 2001, "Peter Jackson", 178);
        DVD dvd2 = new DVD("The Two Towers", 2002, "Peter Jackson", 179);
        DVD dvd3 = new DVD("The Return of the King", 2003, "Peter Jackson", 201);

        LibraryManager<LibraryItem> libraryManager = new LibraryManager<>();

        //testing empty library
        libraryManager.displayItems();

        //add books
        libraryManager.addItem(book1);
        libraryManager.addItem(book2);
        libraryManager.addItem(book3);

        //testing duplicate
        libraryManager.addItem(book2);

        //add dvds
        libraryManager.addItem(dvd1);
        libraryManager.addItem(dvd2);
        libraryManager.addItem(dvd3);

        libraryManager.displayItems();

        //testing removal
        libraryManager.removeItem(book2);
        libraryManager.removeItem(dvd3);

        libraryManager.displayItems();
    }
}
