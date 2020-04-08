package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1111 extends Applet {
Integer aantalX, tafel;
Button okKnop;
String s1,s2;

    public void init() {
        okKnop = new Button ("OK!");
        okKnop.addActionListener(new okKnopListener());
        s1 = "";
        add(okKnop);
    }


    public void paint(Graphics g) {
        int y = 20;
        g.drawString("Tafels:",50,30);
        for (int aantalX = 1; aantalX < 11 ; aantalX++) {
            y += 20;

         s1 = (" " + aantalX + "*" + tafel + "=" + (aantalX * tafel));
         g.drawString(s1,60,y + 20);
         repaint();
        }
        repaint();
    }


class okKnopListener implements ActionListener{
    public void actionPerformed(ActionEvent e) {
        aantalX++;
        if (tafel > 10)
        {
            tafel = 1;
        }
        for (int aantalX = 1; aantalX < 11 ; aantalX++) {
            s1 = (" " + aantalX + "*" + tafel + "=" + (aantalX*tafel));
            repaint();
        }
            repaint();
        }
}



}