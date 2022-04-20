package pacuraru.fabian.lab3.ex3;

public class TestAuthor {
    public static void main(String[] args) {
        Author author= new Author("andrei", "andreiion@yahoo.com", 'm');
        author.getName();
        author.getEmail();
        author.setEmail("ionandrei@yahoo.com");
        author.getEmail();
        author.getGender();
        System.out.print(author.toString());
    }
}
