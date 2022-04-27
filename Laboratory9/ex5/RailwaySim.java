package pacuraru.fabian.lab9.ex5;

import pacuraru.fabian.lab9.ex1.ButtonAndTextField2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RailwaySim extends JFrame {
    JButton addTrain;
    JLabel station1, station2, station3;
    JLabel seg1,seg2,seg3,seg4,seg5,seg6,seg7,seg8,seg9;
    JTextField[] t = new JTextField[9];
    JTextField name, segment;
    public static String[] names = new String[9];
    Segment s1,s2,s3,s4,s5,s6,s7,s8,s9;
    Train[] tr = new Train[9];

    RailwaySim() {
        setTitle("Railway Traffic Simulator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
        setSize(350,260);
        setVisible(true);
    }

    public void init() {

        this.setLayout(null);

        //build station Cluj-Napoca
        Controller c1 = new Controller("Cluj-Napoca");

        s1 = new Segment(1);
        s2 = new Segment(2);
        s3 = new Segment(3);

        c1.addControlledSegment(s1);
        c1.addControlledSegment(s2);
        c1.addControlledSegment(s3);

        //build station Bucuresti
        Controller c2 = new Controller("Bucuresti");

        s4 = new Segment(4);
        s5 = new Segment(5);
        s6 = new Segment(6);

        c2.addControlledSegment(s4);
        c2.addControlledSegment(s5);
        c2.addControlledSegment(s6);

        //build station Constanta
        Controller c3 = new Controller("Constanta");

        s7 = new Segment(7);
        s8 = new Segment(8);
        s9 = new Segment(9);

        c3.addControlledSegment(s7);
        c3.addControlledSegment(s8);
        c3.addControlledSegment(s9);

        //connect the 3 controllers

        c1.setNeighbourController(c2);
        c1.setNeighbourController(c3);
        c2.setNeighbourController(c1);
        c2.setNeighbourController(c3);
        c3.setNeighbourController(c1);
        c3.setNeighbourController(c2);

        station1 = new JLabel("Cluj-Napoca");
        station1.setBounds(10,10,100,20);
        station2 = new JLabel("Bucuresti");
        station2.setBounds(10,60,100,20);
        station3 = new JLabel("Constanta");
        station3.setBounds(10,110,100,20);

        seg1 = new JLabel("s1");
        seg1.setBounds(10,30,20,20);
        seg2 = new JLabel("s2");
        seg2.setBounds(120,30,20,20);
        seg3 = new JLabel("s3");
        seg3.setBounds(230,30,20,20);
        seg4 = new JLabel("s4");
        seg4.setBounds(10,80,20,20);
        seg5 = new JLabel("s5");
        seg5.setBounds(120,80,20,20);
        seg6 = new JLabel("s6");
        seg6.setBounds(230,80,20,20);
        seg7 = new JLabel("s7");
        seg7.setBounds(10,130,20,20);
        seg8 = new JLabel("s8");
        seg8.setBounds(120,130,20,20);
        seg9 = new JLabel("s9");
        seg9.setBounds(230,130,20,20);

        for (int i = 0; i < 9; i++) {
            t[i] = new JTextField(names[i]);
            t[i].setBounds(30 + i % 3 * 110, 32 + i / 3 * 50, 80, 20);
            add(t[i]);
        }

        name = new JTextField("Train name");
        name.setBounds(10,190,100,20);
        segment = new JTextField("Segment");
        segment.setBounds(120,190,100,20);

        addTrain = new JButton("Add Train");
        addTrain.setBounds(230,190,100,20);
        addTrain.addActionListener(new TratareButonAddTrain());

        add(station1); add(station2); add(station3);
        add(seg1); add(seg2); add(seg3);
        add(seg4); add(seg5); add(seg6);
        add(seg7); add(seg8); add(seg9);
        add(name); add(segment); add(addTrain);

    }

    public static void main(String[] args) {
        new RailwaySim();
    }

    class TratareButonAddTrain implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String n = name.getText();
            String pwd = segment.getText();
            switch (pwd) {
                case "s1":
                    if(names[0]==null) {
                        names[0] = name.getText();
                    }
                    if(tr[0]==null) {
                        tr[0] = new Train("Cluj-Napoca", name.getText());
                        s1.arriveTrain(tr[0]);
                    }
                    break;
                case "s2":
                    if(names[1]==null) {
                        names[1] = name.getText();
                    }
                    if(tr[1]==null) {
                        tr[1] = new Train("Cluj-Napoca", name.getText());
                        s2.arriveTrain(tr[1]);
                    }
                    break;
                case "s3":
                    if(names[2]==null) {
                        names[2] = name.getText();
                    }
                    if(tr[2]==null) {
                        tr[2] = new Train("Cluj-Napoca", name.getText());
                        s3.arriveTrain(tr[2]);
                    }
                    break;
                case "s4":
                    if(names[3]==null) {
                        names[3] = name.getText();
                    }
                    if(tr[3]==null) {
                        tr[3] = new Train("Bucuresti", name.getText());
                        s4.arriveTrain(tr[3]);
                    }
                    break;
                case "s5":
                    if(names[4]==null) {
                        names[4] = name.getText();
                    }
                    if(tr[4]==null) {
                        tr[4] = new Train("Bucuresti", name.getText());
                        s5.arriveTrain(tr[4]);
                    }
                    break;
                case "s6":
                    if(names[5]==null) {
                        names[5] = name.getText();
                    }
                    if(tr[5]==null) {
                        tr[5] = new Train("Bucuresti", name.getText());
                        s6.arriveTrain(tr[5]);
                    }
                    break;
                case "s7":
                    if(names[6]==null) {
                        names[6] = name.getText();
                    }
                    if(tr[6]==null) {
                        tr[6] = new Train("Constanta", name.getText());
                        s7.arriveTrain(tr[6]);
                    }
                    break;
                case "s8":
                    if(names[7]==null) {
                        names[7] = name.getText();
                    }
                    if(tr[7]==null) {
                        tr[7] = new Train("Constanta", name.getText());
                        s8.arriveTrain(tr[7]);
                    }
                    break;
                case "s9":
                    if(names[8]==null) {
                        names[8] = name.getText();
                    }
                    if(tr[8]==null) {
                        tr[8] = new Train("Constanta", name.getText());
                        s9.arriveTrain(tr[8]);
                    }
                    break;
                default:
                    break;
            }
            dispose();
            new RailwaySim();
        }
    }
}
