package pacuraru.fabian.lab4.ex3;

public class TestBook {
    public static void main(String[] Args) {
        Author author = new Author("Andrei", "andrei@gmail.com", 'm');
        Book book1 = new Book("indigo", author, 12);
        Book book2 = new Book("create", author, 29, 311);
        System.out.print(book1.getName() + "\n");
        System.out.print(book1.getAuthor() + "\n");
        System.out.print(book1.getPrice() + "\n");
        book1.setPrice(25.5);
        System.out.print(book1.getPrice() + "\n");
        System.out.print(book2.getQtyInStock() + "\n");
        book1.setQtyInStock(114);
        System.out.print(book1.getQtyInStock() + "\n");
        System.out.print(book2.toString() + "\n");
    }
}
