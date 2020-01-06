package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class opdracht1203 extends Applet {

TextField [] tekstvak = new TextField[5];
Button knop;
String [] uitslag = new String[5];


    public void init() {
        for (int i = 0; i < 5; i++) {
            tekstvak[i] = new TextField("",10);
            add(tekstvak[i]);
        }
        knop = new Button("OK!");
        knop.addActionListener(new KnopListener());
        add(knop);
    }



    public void paint(Graphics g) {
    }

    class KnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < 5 ; i++) {
                uitslag[i] = tekstvak[i].getText();
            }

// Arrays.sort indien nodig is het een Class.
// ^--- Sorteert de userInput
            Arrays.sort(uitslag);
            for (int i = 0; i < 5; i++) {
                tekstvak[i].setText(uitslag[i]);
                repaint();
            }

        }
    }




}
