package pacuraru.fabian.lab11.ex1;

import javax.swing.*;

public class MonitoringApp extends JFrame {
    JTextField text;

    MonitoringApp(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
        setSize(220,120);
        setVisible(true);
    }

    public void init(){
        text = new JTextField();
        text.setEditable(false);
        text.setBounds(40,40,210,20);
        add(text);
    }

    public void update(double k){
        text.setText(String.valueOf(k)+" degrees Celsius");
        text.setBounds(40,30,130,30);
    }
}
