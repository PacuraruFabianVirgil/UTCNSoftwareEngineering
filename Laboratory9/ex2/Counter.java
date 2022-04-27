package pacuraru.fabian.lab9.ex2;

import pacuraru.fabian.lab9.ex1.ButtonAndTextField2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter extends JFrame {
    JTextArea area;
    JButton inc, res;
    static int counter = 0;

    Counter() {
        setTitle("Incrementer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
        setSize(300,600);
        setVisible(true);
    }

    public void init() {

        this.setLayout(null);

        inc = new JButton("Press");
        inc.setBounds(100,10,100, 40);

        inc.addActionListener(new Action1());

        area = new JTextArea();
        area.setBounds(20,60,250,450);

        res = new JButton("Reset");
        res.setBounds(100,520,100, 40);

        res.addActionListener(new Action2());

        add(inc); add(area); add(res);
    }

    public static void main(String[] args) {
        new Counter();
    }

    class Action1 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            counter+=1;
            Counter.this.area.append("You pressed the button for " + counter +" times.\n");
        }
    }

    class Action2 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            counter=0;
            Counter.this.area.append("The counter is back at 0.\n");
        }
    }

}
