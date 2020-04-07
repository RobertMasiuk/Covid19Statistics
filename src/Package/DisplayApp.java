package Package;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DisplayApp {


    private JButton Refresh;
    private JPanel panelName;
    private JTextField quantity;

    public DisplayApp() {
        Refresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String text;
               text = "test";
               quantity.setText(text);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("DisplayApp");
        frame.setContentPane(new DisplayApp().panelName);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);



    }
}
