public class Book {
    private String title;
    private Author author;

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    private int publicationYear;

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }
}
