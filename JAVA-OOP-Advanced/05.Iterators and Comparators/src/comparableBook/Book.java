package comparableBook;

import java.util.Arrays;
import java.util.List;

public class Book implements Comparable<Book> {
    private String title;
    private int year;
    private List<String>authors;

    public Book(String title, int year, String... authors){
        this.setAuthors(Arrays.asList(authors));
        this.setTitle(title);
        this.setYear(year);
    }

    public String getTitle() {
        return this.title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return this.year;
    }

    private void setYear(int year) {
        this.year = year;
    }

    public List<String> getAuthors() {
        return this.authors;
    }

    private void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    @Override
    public int compareTo(Book o) {
        if(this.getTitle().compareTo(o.getTitle())==0){
            return this.getYear()-o.getYear();
        }
        return this.getTitle().compareTo(o.getTitle());
    }

    @Override
    public String toString() {
        return this.getTitle() + " " + this.getYear();
    }
}
