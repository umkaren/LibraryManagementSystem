abstract class LibraryItem {
    private String title;

    private int releaseYear;

    public LibraryItem(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    /**
     *
     * @return the type of the libray item
     */
    public abstract String getItemType();

    /**
     *
     * @return returns the details of the library item
     */
    public abstract String getItemDetails();

    //getter
    public String getTitle() {
        return  title;
    }

    //getter
    public int getReleaseYear() {
        return releaseYear;
    }
}
