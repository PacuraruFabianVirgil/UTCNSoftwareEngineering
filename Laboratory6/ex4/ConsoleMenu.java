package pacuraru.fabian.lab6.ex4;

import java.util.Scanner;
import java.util.Set;

public class ConsoleMenu {
    public static void main(String[] args) {
        Dictionary dictionary1 = new Dictionary();
        int choice;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("\n1. Add" +
                    "\n2. Find" +
                    "\n3. Get all words" +
                    "\n4. Get all descriptions" +
                    "\n5. Exit\n");
            choice = scanner.nextInt();
            switch(choice) {
                case 1:
                    System.out.print("word: ");
                    String word = scanner.next();
                    System.out.print("definition: ");
                    String definition = scanner.next();
                    dictionary1.addWord(new Word(word), new Definition(definition));
                    System.out.print(word + " has been added to the dictionary");
                    break;
                case 2:
                    System.out.print("search for: ");
                    Word wordWor = new Word(scanner.next());
                    Definition desc = dictionary1.getDefinition(wordWor);
                    System.out.print("definition: " + desc.getDescription());
                    break;
                case 3:
                    dictionary1.getAllWords();
                    break;
                case 4:
                    dictionary1.getAllDefinitions();
                    break;
                case 5:
                    break;
            }
        } while(choice != 5);
    }
}
