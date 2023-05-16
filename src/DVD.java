public class DVD extends LibraryItem {
    private String director;
    private int duration;

    public DVD (String title, int releaseYear, String director, int duration) {
        super(title, releaseYear);
        this.director = director;
        this.duration = duration;
    }

    //getter
    public String getDirector() {
        return director;
    }

    //getter
    public int getDuration() {
        return duration;
    }

    @Override
    public String getItemType() {
        return "DVD";
    }

    @Override
    public String getItemDetails() {
        return "Title: " + getTitle() + ", Release Year: " + getReleaseYear() + ", Director: " + director + ", Duration: " + duration;
    }
}
