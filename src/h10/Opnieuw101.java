package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opnieuw101 extends Applet {

Button ok;
String uitwerking;
Integer hoogsteCijfer, nieuweCijfer;
TextField input;

    public void init() {
        hoogsteCijfer = 0;

        input = new TextField("Typ hier uw getal in");
        input.addActionListener(new okAL());
        add(input);


    }

    public void paint(Graphics g) {
        g.drawString("Het hoogste getal is: " + nieuweCijfer, 50,50);
    }

    class okAL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
//            System.out.println("werkt");
            nieuweCijfer = Integer.parseInt(input.getText());
            if (nieuweCijfer >= hoogsteCijfer ) {
                hoogsteCijfer = nieuweCijfer;
                repaint();
            } else {
                //Ik heb hier expres geen repaint() bijgevoegd zodat de applet niet "knippert".
                nieuweCijfer = hoogsteCijfer;

            }
        }
    }

}
