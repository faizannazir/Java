import javax.swing.*;
import java.awt.*;

public class Main {
    Main()
    {
        JFrame jframe = new JFrame();
        jframe.setLayout(null);
        jframe.setTitle("First App");
        jframe.setSize(500,500);
        Button bt = new Button();
        TextField tf = new TextField();
        tf.setBounds(40,40,100,20);
        bt.setLabel("Button");
        bt.setBounds(4,25,50,50);
        bt.setSize(45,50);
        jframe.add(bt);
        jframe.add(tf);
        JLabel jLabel = new JLabel("Label");
        jLabel.setBounds(120,140,120,150);
        jframe.add(jLabel);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
     new Main();
        System.out.println("Hello world!");
    }
}