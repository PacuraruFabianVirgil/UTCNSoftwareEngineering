package pacuraru.fabian.lab7.ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

public class CharCounter {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scannerFromConsole = new Scanner(System.in);
        System.out.print("Write the character that you want to look for\n");
        char e = scannerFromConsole.next().charAt(0);
        int count = 0;
        URL path = CharCounter.class.getResource("data.txt");
        File file = new File(path.getFile());
        Scanner scannerFromFile = new Scanner(file);
        while(scannerFromFile.hasNext()) {
            String line = scannerFromFile.next();
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if (e==c) {
                    count++;
                }
            }
        }
        scannerFromConsole.close();
        scannerFromFile.close();
        System.out.print("The character that you selected appeared "+count+" times in the file\n");
    }
}
