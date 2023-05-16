public class Book extends LibraryItem{
    private String author;
    private String ISBN;

    public Book(String title, int releaseYear, String author, String ISBN) {
        super(title, releaseYear);
        this.author = author;
        this.ISBN = ISBN;
    }

    //getter
    public String getAuthor() {
        return author;
    }

    //getter
    public String getISBN() {
        return ISBN;
    }

    @Override
    public String getItemType() {
        return "Book";
    }

    @Override
    public String getItemDetails() {
        return "Title: " + getTitle() + ", Author: " + author + ", ISBN: " + ISBN + ", Release Year: " + getReleaseYear();
    }
}
