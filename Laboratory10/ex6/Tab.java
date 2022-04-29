package pacuraru.fabian.lab10.ex6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Tab extends JFrame {
    JButton but1, but2;
    JLabel label;
    boolean pause = false;
    Clock clock;

    Tab() throws InterruptedException {
        setTitle("Chronometer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
        setSize(300,200);
        setVisible(true);
    }

    public void init() throws InterruptedException {

        this.setLayout(null);

        but1 = new JButton("Start / Stop");
        but1.setBounds(30, 120, 100, 30);
        but1.addActionListener(new Action1());

        but2 = new JButton("Reset");
        but2.setBounds(160, 120, 100, 30);
        but2.addActionListener(new Action2());

        label = new JLabel();
        label.setFont(label.getFont().deriveFont(50.0f));
        label.setHorizontalAlignment( SwingConstants.CENTER );
        label.setBounds(20, 30, 250, 60);

        clock = new Clock();

        Thread show = new Thread() {
            public void run() {
                while (clock.h < 24) {
                    int s1 = clock.s;
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    int s2 = clock.s;
                    if (s1 != s2) {
                        DecimalFormat fmt = new DecimalFormat("00");
                        label.setText(fmt.format(clock.h) + ":" + fmt.format(clock.m) + ":" + fmt.format(clock.s));
                    }
                }
            }
        };

        show.start();
        clock.start();

        add(but1); add(but2); add(label);
    }

    public static void main(String[] args) throws InterruptedException {
        new Tab();
    }

    class Action1 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            pause = !pause;
            if(pause) {
                clock.pause = true;
            }
            else {
                clock.pause = false;
                synchronized (clock.pauseLock) {
                    clock.pauseLock.notify();
                }
            }
        }
    }

    class Action2 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            dispose();
            try {
                new Tab();
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
    }
}
