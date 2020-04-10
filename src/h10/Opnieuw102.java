package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opnieuw102 extends Applet {

    Button ok;
    String uitwerking;
    Integer hoogsteCijfer, nieuweCijfer, laagsteCijfer;
    TextField input;
    Boolean eersteCijfer;

    public void init() {

        eersteCijfer = true;
        input = new TextField("Typ hier uw getal in");
        input.addActionListener(new okAL());
        add(input);


    }

    public void paint(Graphics g) {
        g.drawString("Het hoogste getal is: " + hoogsteCijfer, 50,50);
        g.drawString("Het laagste getal is: " + laagsteCijfer,50,65);
    }

    class okAL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
//            System.out.println("werkt");
            nieuweCijfer = Integer.parseInt(input.getText());

            //If-statement voor het laagste cijfer.
            // If (eerste cijfer = true) liep ik op vast. Let hiermee volgende keer op.
            if (eersteCijfer) {
                hoogsteCijfer = nieuweCijfer;
                laagsteCijfer = nieuweCijfer;
                eersteCijfer = false;
                repaint();
            } else {
                if (nieuweCijfer <= laagsteCijfer){
            laagsteCijfer = nieuweCijfer;
            repaint();
                } else if (nieuweCijfer >= hoogsteCijfer) {
                   hoogsteCijfer = nieuweCijfer;
                   repaint();
                }
            }
        }
    }
}
