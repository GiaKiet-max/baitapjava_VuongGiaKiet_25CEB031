public class Book {

    private String isbn;
    private String name;
    private Author author;
    private double price;
    private int qty = 0;

    public Book(String name, String isbn, Author author, double price) {
        this.name = name;
        this.isbn = isbn;
        this.author = author;
        this.price = price;
    }

    public Book(String isbn, String name, Author author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorNames() {
        return author.toString();
    }

    public String toString() {
        return "Book[isbn= " + isbn + ",name= " + name + ",authors=" + author.toString()
                + ",price=" + price + ",qty=" + qty + "]";

    }


}
