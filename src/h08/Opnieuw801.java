package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opnieuw801 extends Applet {

    Button resetKnop;
    Button okKnop;
    TextField userInput;
    String message;

    public void init() {
        userInput = new TextField("Typ hier uw input", 25);
        userInput.addActionListener(new okKnopList());
        add(userInput);

        resetKnop = new Button("Reset");
        resetKnop.addActionListener(new resetKnopList());
        add(resetKnop);

        okKnop = new Button ("OK!");
        okKnop.addActionListener(new okKnopList());
        add(okKnop);

        message = "Er is nog niets getypt";
    }


    public void paint(Graphics g) {
        g.drawString(message,70,50);
    }

    class okKnopList implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            message = userInput.getText();
            repaint();
        }
    }

    class resetKnopList implements ActionListener{
        public void actionPerformed(ActionEvent e) {userInput.setText("");
        message = "Er is nog niets getypt";
            repaint();
        }
    }
}
