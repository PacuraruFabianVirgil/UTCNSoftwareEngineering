package pacuraru.fabian.lab4.ex4;

public class Author {
    private String name;
    private String email;
    private char gender;
    public Author(String myName, String myEmail, char myGender) {
        name = myName;
        email = myEmail;
        gender = myGender;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String myEmail) {
        email = myEmail;
    }
    public char getGender() {
        return gender;
    }
    public String toString() {
        return name + " (" + gender + ") at " + email + ".\n";
    }
}
