package pacuraru.fabian.lab11.ex2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProductView extends JFrame {
    ProductController prod = new ProductController();
    JTextArea list;
    JTextField name,qty,price;
    JButton add,view,delete,change;

    ProductView(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
        setSize(335,440);
        setVisible(true);
    }

    public void init(){
        this.setLayout(null);
        list = new JTextArea();
        list.setEditable(false);
        list.setBounds(20,20,290,250);
        name = new JTextField();
        name.setBounds(20,290,90,20);
        name.setText("Name (String)");
        qty = new JTextField();
        qty.setBounds(120,290,90,20);
        qty.setText("Quantity (int)");
        price = new JTextField();
        price.setBounds(220,290,90,20);
        price.setText("Price (double)");
        add = new JButton("Add product");
        add.setBounds(180,330,130,20);
        view = new JButton("View products");
        view.setBounds(20,330,130,20);
        delete = new JButton("Delete product");
        delete.setBounds(20,370,130,20);
        change = new JButton("Change product");
        change.setBounds(180,370,130,20);
        add.addActionListener(new Action1());
        view.addActionListener(new Action2());
        delete.addActionListener(new Action3());
        change.addActionListener(new Action4());
        add(list); add(name); add(qty); add(price);
        add(add); add(view); add(delete); add(change);
    }

    public static void main(String[] args){
        ProductView p = new ProductView();
    }

    class Action1 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            prod.addProduct(name.getText(),Integer.parseInt(qty.getText()),Double.parseDouble(price.getText()));
        }
    }

    class Action2 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            list.setText(null);
            list.setText(prod.viewProducts());
        }
    }

    class Action3 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            prod.deleteProduct(name.getText());
        }
    }

    class Action4 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            prod.changeQuantity(name.getText(),Integer.parseInt(qty.getText()));
        }
    }
}
