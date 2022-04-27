package pacuraru.fabian.lab9.ex4;

import pacuraru.fabian.lab9.ex2.Counter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class XandO extends JFrame {
    JButton but[][] = new JButton[3][3];
    JTextArea area;
    static int counter = 0, win = 0;
    static int a[][] = new int[3][3];

    XandO() {
        setTitle("X&O Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
        setSize(600,600);
        setVisible(true);
    }

    public void init() {

        this.setLayout(null);

        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                if (a[i][j] == 2) {
                    but[i][j] = new JButton("0");
                } else if (a[i][j] == 1) {
                    but[i][j] = new JButton("X");
                } else {
                    but[i][j] = new JButton();
                }
                but[i][j].setFont(new Font("Courier", Font.BOLD,75));
                but[i][j].setBounds(10+100*j, 10+100*i, 90, 90);
                but[i][j].addActionListener(new Action(i,j));
                add(but[i][j]);
            }
        }

        if ((counter % 2 == 0) && (win == 0)) {
            area = new JTextArea("It's player1(X)'s turn.");
        } else if (win == 1){
            area = new JTextArea("Player1(X) wins.");
        } else if (win == 2){
            area = new JTextArea("Player2(0) wins.");
        } else if (win == 3){
            area = new JTextArea("It's a draw.");
        } else {
            area = new JTextArea("It's player2(0)'s turn.");
        }
        area.setBounds(10,310,290,20);
        add(area);
    }

    public static void main(String[] args) {
        new XandO();
    }

    class Action implements ActionListener {
        int  i_act, j_act;

        Action (int i_act, int j_act) {
            this.i_act = i_act;
            this.j_act = j_act;
        }

        public void actionPerformed(ActionEvent e) {
            if(a[i_act][j_act] != 0) {
                return;
            }
            if (counter % 2 == 0) {
                a[i_act][j_act] = 1;
            } else {
                a[i_act][j_act] = 2;
            }
            counter+=1;
            didSomeoneWin();
            new XandO();
        }

        public void didSomeoneWin() {
            if(win != 0){
                return;
            }
            int all = 0;
            for (int i=0; i<3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (a[i][j] != 0){
                        all++;
                    }
                }
            }
            if(all>=9){
                win = 3;
            };

            for (int i=0; i<3; i++) {
                if (((a[i][0]==a[i][1])&&(a[i][1]==a[i][2])&&(a[i][2]==2))||
                    ((a[0][i]==a[1][i])&&(a[1][i]==a[2][i])&&(a[2][i]==2))||
                    ((a[0][0]==a[1][1])&&(a[1][1]==a[2][2])&&(a[2][2]==2))||
                    ((a[0][2]==a[1][1])&&(a[1][1]==a[2][0])&&(a[2][0]==2)))
                {
                    win = 2;
                }
                if (((a[i][0]==a[i][1])&&(a[i][1]==a[i][2])&&(a[i][2]==1))||
                        ((a[0][i]==a[1][i])&&(a[1][i]==a[2][i])&&(a[2][i]==1))||
                        ((a[0][0]==a[1][1])&&(a[1][1]==a[2][2])&&(a[2][2]==1))||
                        ((a[0][2]==a[1][1])&&(a[1][1]==a[2][0])&&(a[2][0]==1)))
                {
                    win = 1;
                }
            }
        }
    }
}
