package book;

import java.util.List;

public class Book {
    private List<Author> author;
    private Publisher publisher;
    private List<Chapter> chapters;

    public Book(List<Author> author, Publisher publisher, List<Chapter> chapters) {
        this.author = author;
        this.publisher = publisher;
        this.chapters = chapters;
    }
}
