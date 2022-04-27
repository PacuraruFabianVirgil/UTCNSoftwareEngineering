package pacuraru.fabian.lab9.ex3;

import pacuraru.fabian.lab9.ex1.ButtonAndTextField2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class findFile extends JFrame {

    JTextField fileName;
    JButton search;
    JTextArea area;

    findFile() {
        setTitle("Search files");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
        setSize(320,400);
        setVisible(true);
    }

    public void init() {
        this.setLayout(null);

        fileName = new JTextField();
        fileName.setBounds(10,10,200, 20);

        search = new JButton("Search");
        search.setBounds(220,10,80,20);
        search.addActionListener(new Action());

        area = new JTextArea();
        area.setBounds(10,40,290,320);

        add(fileName); add(search); add(area);
    }

    public static void main(String args[])
    {
        new findFile();
    }

    class Action implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String name = "\\src\\pacuraru\\fabian\\lab9\\ex3\\"+fileName.getText()+".txt";
            String dir = System.getProperty("user.dir");
            String path = dir+name;
            String content="";
            try {
                content = Files.readString(Paths.get(path), StandardCharsets.US_ASCII);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            findFile.this.area.append(content);
        }
    }
}
