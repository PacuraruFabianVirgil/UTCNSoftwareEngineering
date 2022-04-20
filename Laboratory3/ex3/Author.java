package pacuraru.fabian.lab3.ex3;

public class Author {
    private String name;
    private String email;
    private char gender;
    public Author(String myName, String myEmail, char myGender) {
        name = myName;
        email = myEmail;
        gender = myGender;
    }
    public void getName() {
        System.out.println(name+ "\n");
    }
    public void getEmail() {
        System.out.println(email+ "\n");
    }
    public void setEmail(String myEmail) {
        email = myEmail;
    }
    public void getGender() {
        System.out.println(gender + "\n");
    }
    public String toString() {
        return name + " (" + gender + ") at " + email + ".\n";
    }
}
