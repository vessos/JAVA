package comparableBook;

import java.util.Iterator;
import java.util.function.Consumer;

public class Library<Book> implements Iterable<Book>{
    private Book[] books;

    public Library(Book... books) {
        this.books = books;
    }

    @Override
    public Iterator<Book> iterator() {
        return new LibIterator();
    }

    @Override
    public void forEach(Consumer<? super Book> action) {

    }

    private final class LibIterator implements Iterator<Book>{

        private int counter;

        public LibIterator() {
            this.counter = 0;
        }

        @Override
        public boolean hasNext() {
            return this.counter<books.length;
        }

        @Override
        public Book next() {
            return books[counter++];
        }
    }
}
