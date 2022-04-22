package pacuraru.fabian.lab4.ex2;

public class TestAuthor {
    public static void main(String[] Args) {
        Author author = new Author("Ion", "ion@yahoo.com", 'm');
        System.out.print(author.getName() + "\n");
        System.out.print(author.getEmail() + "\n");
        System.out.print(author.getGender() + "\n");
        author.setEmail("ionica@yahoo.com");
        System.out.print(author.toString() + "\n");
    }
}
