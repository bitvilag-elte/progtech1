package book;

import java.util.List;

public class Publisher {
    private List<Book> books;
    private List<Employee> employees;

    public Publisher(List<Book> books) {
        this.books = books;
    }
}
