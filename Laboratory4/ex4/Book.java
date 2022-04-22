package pacuraru.fabian.lab4.ex4;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qtyInStock;
    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }
    public Book(String name, Author[] authors, double price, int qtyInStock) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }
    public String getName() {
        return name;
    }
    public String getAuthors() {
        String en = "";
        for (int i = 0; i < authors.length; i++) {
            en = en + " " + authors[i].getName();
        }
        return en;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQtyInStock() {
        return qtyInStock;
    }
    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }
    public String toString() {
        return name + " by " + authors.length + " authors.\n";
    }
    public void printAuthors() {
        for (int i = 0; i < authors.length; i++) {
            System.out.print(" " + authors[i].getName());
        }
    }
}
