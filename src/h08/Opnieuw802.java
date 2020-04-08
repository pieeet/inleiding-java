package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opnieuw802 extends Applet {
Button bk, gk, wk, mk;
String message;
int ab, ag, aw, am, totaal;



    public void init() {

        bk = new Button("+1 student");
        bk.addActionListener(new bkAL());
        add(bk);

        gk = new Button("+1 studente");
        gk.addActionListener(new gkAL());
        add(gk);

        wk = new Button("+1 Vrouw");
        wk.addActionListener(new wkAL());
        add(wk);

        mk = new Button("+1 Man");
        mk.addActionListener(new mkAL());
        add(mk);

    }


    public void paint(Graphics g) {
        g.drawString("Het aantal mannelijke studenten = " + ab, 50,50);
        g.drawString("Het aantal vrouwelijke studenten = " + ag, 50,65);
        g.drawString("Het aantal vrouwen = " + aw, 50,80);
        g.drawString("Het aantal mannen = " + am, 50,95);
        g.drawString("Het totaal aantal bezoekers = " + (am+aw+ag+ab), 50,110);
    }

    class bkAL implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            System.out.println("De bkAL werkt!");
            ab++;
            repaint();
        }
    }
    class gkAL implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            System.out.println("De gkAL werkt!");
            ag++;
            repaint();
        }
    }
    class wkAL implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            aw++;
            repaint();
        }
    }
    class mkAL implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            am++;
            repaint();
        }
    }

}
