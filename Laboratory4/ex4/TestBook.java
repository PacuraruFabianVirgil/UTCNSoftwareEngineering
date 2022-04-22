package pacuraru.fabian.lab4.ex4;

public class TestBook {
    public static void main(String[] Args) {
        Author authors[] =new Author[3];
        authors[0] = new Author("Andrei", "andrei@gmail.com", 'm');
        authors[1] = new Author("George", "george@gmail.com", 'm');
        authors[2] = new Author("Maria", "maria@gmail.com", 'f');
        System.out.print(authors[0].getName() + "\n");
        System.out.print(authors[1].getEmail() + "\n");
        System.out.print(authors[2].toString() + "\n");
        Book book1 = new Book("Triton", authors, 22.5);
        Book book2 = new Book("Atlantis", authors, 43.5, 48);
        System.out.print(book1.getName() + "\n");
        System.out.print(book1.getAuthors() + "\n");
        System.out.print(book2.getPrice() + "\n");
        System.out.print(book2.getQtyInStock() + "\n");
        book1.setPrice(42.4);
        System.out.print(book1.getPrice() + "\n");
        book1.setQtyInStock(82);
        System.out.print(book1.getQtyInStock() + "\n");
        System.out.print(book1.toString() + "\n");
        book2.printAuthors();
    }
}
