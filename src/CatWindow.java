import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/** Class: CatWindow.java
 * @author Eden Truong
 * @version 1.0
 * Written: Jan 17, 2024
 *
 * This class is the gui using javaGUI even though i hate it, and it is also my first time using it
 */

public class CatWindow{
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }
}

class MyFrame extends JFrame implements ActionListener {

    MyFrame() {
        JFrame frame;
        JLabel label;
            frame = new JFrame(); //bro this is my first time using JavaGUI LMAO please save me god
            frame.setTitle("Cat Adoption Center");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            frame.setSize(400, 400);
            frame.setVisible(true);
            frame.getContentPane().setBackground(new Color(100,82,86));

            //Text
            label = new JLabel();
            label.setText("Welcome to the kennel!");
            label.setHorizontalTextPosition(JLabel.CENTER);
            label.setVerticalTextPosition(JLabel.TOP);
            label.setForeground(new Color(255,255,255));
            label.setVerticalAlignment(JLabel.TOP);
            label.setHorizontalAlignment(JLabel.CENTER);
            frame.add(label);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
