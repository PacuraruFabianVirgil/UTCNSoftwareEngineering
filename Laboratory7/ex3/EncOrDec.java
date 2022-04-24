package pacuraru.fabian.lab7.ex3;

import pacuraru.fabian.lab7.ex2.CharCounter;

import java.io.*;
import java.net.URL;
import java.nio.file.Path;
import java.util.Scanner;

public class EncOrDec {
    public static void encoder(File file) throws IOException {
        Scanner scanner = new Scanner(file);
        String name = file.getName();
        String fName = "";
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i)=='.') break;
            fName = fName + name.charAt(i);
        }
        String inDirectory = "src/pacuraru/fabian/lab7/ex3/";
        PrintWriter out = new PrintWriter(inDirectory+fName+".enc");
        while(scanner.hasNextLine()) {
            String word = scanner.nextLine();
            for (int i = 0; i < word.length(); i++) {
                int c = (int)word.charAt(i);
                c = c<<1;
                out.write((char)c);
            }
            out.write('\n');
        }
        scanner.close();
        out.close();
    }
    public static void decoder(File file) throws IOException {
        Scanner scanner = new Scanner(file);
        String name = file.getName();
        String fName = "";
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i)=='.') break;
            fName = fName + name.charAt(i);
        }
        String inDirectory = "src/pacuraru/fabian/lab7/ex3/";
        PrintWriter out = new PrintWriter(inDirectory+fName+".dec");
        while(scanner.hasNextLine()) {
            String word = scanner.nextLine();
            for (int i = 0; i < word.length(); i++) {
                int c = (int)word.charAt(i);
                c = c>>1;
                out.write((char)c);
            }
            out.write('\n');
        }
        scanner.close();
        out.close();
    }
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write the complete name of the file that you want to alter\n");
        String fileName = scanner.next();
        URL path = EncOrDec.class.getResource(fileName);
        System.out.print("What do you want to do with it?\n");
        System.out.print("1.Encode\n");
        System.out.print("2.Decode\n");
        int option = scanner.nextInt();
        switch(option) {
            case 1:
                encoder(new File(path.getFile()));
                break;
            case 2:
                decoder(new File(path.getFile()));
                break;
            default:
                break;
        }
        scanner.close();
    }
}
