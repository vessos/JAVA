package bookShop;


public class Book {

    private String title;
    private String author;
    private double price;

    public Book(String author, String title, double price) {

        this.setTitle(title);
        this.setAuthor(author);
        this.setPrice(price);
    }

    protected String getTitle() {
        return this.title;
    }

    protected void setTitle(String title) {
        if (title.length() < 3) {
            throw new IllegalArgumentException("Title not valid!");
        }
        this.title = title;
    }

    protected String getAuthor() {
        return this.author;
    }

    protected void setAuthor(String author) {
        String[]authorsName = author.split(" ");
        String validation = "0123456789";
        if(authorsName.length>1&&validation.contains(String.valueOf(authorsName[1].charAt(0)))){
            throw new IllegalArgumentException("Author not valid!");
        }
        this.author = author;
    }

    protected double getPrice() {
        return this.price;
    }

    protected void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price not valid!");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Type: ").append(this.getClass().getSimpleName())
                .append(System.lineSeparator())
                .append("Title: ").append(this.getTitle())
                .append(System.lineSeparator())
                .append("Author: ").append(this.getAuthor())
                .append(System.lineSeparator())
                .append("Price: ").append(this.getPrice())
                .append(System.lineSeparator());
        return sb.toString();
    }
}



