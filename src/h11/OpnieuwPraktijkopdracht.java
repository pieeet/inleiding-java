package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpnieuwPraktijkopdracht extends Applet {
Integer tafelNummer, aantalX;
TextField userInput;
Button okKnop;
Label userInputL;

        public void init() {

            userInput = new TextField("");
            userInputL = new Label ("Kies hier uw tafel");
            userInput.addActionListener(new okKnopAL());
            add(userInput);
            add(userInputL);

            okKnop = new Button("OK!");
            okKnop.addActionListener(new okKnopAL());
            add(okKnop);

    }


        public void paint(Graphics g) {

            int    x = 50;
            int    y = 50;

            for (int i = 1; i < 11; i++) {
                g.drawString("" + tafelNummer + " x " + i + " = " + tafelNummer*i, x, y);
                y = y + 15;

            }
    }

    class okKnopAL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tafelNummer = Integer.parseInt(userInput.getText());
       repaint();
            }
    }




}
