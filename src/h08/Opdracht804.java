package h08;

import javax.xml.soap.Text;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht804 extends Applet {

Float  inputLinks;
Float inputRechts;
Float uitwerkingX;

TextField tekstvakLinks;
TextField tekstvakRechts;
Button  knopKeer;
Button  knopDelen;
Button  knopPlus;
Button  knopMin;

 public void init() {
        setSize(700,350);
    tekstvakLinks = new TextField(20);
//   tekstvakLinks.addActionListener(new TekstvakLinksListener());
    tekstvakRechts = new TextField(20);
    tekstvakRechts.addActionListener(new TekstvakRechtsListener());

    add(tekstvakLinks);
    add(tekstvakRechts);

    knopDelen = new Button("/");
    knopDelen.addActionListener(new KnopDelenListener());
    add(knopDelen);

    knopKeer  = new Button("*");
    knopKeer.addActionListener(new KnopKeerListener());
    add(knopKeer);

    knopPlus  = new Button("+");
   knopPlus.addActionListener(new KnopPlusListener());
    add(knopPlus);

    knopMin   = new Button("-");
       knopMin.addActionListener(new KnopMinListener());
     add(knopMin);

    add(knopDelen);
    add(knopKeer);
    add(knopPlus);
    add(knopMin);

    }

    public void paint(Graphics g) {
        }

class TekstvakLinksListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {

    }
}

class TekstvakRechtsListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {


    }
}
    class KnopKeerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            inputLinks = Float.parseFloat(tekstvakLinks.getText());
            inputRechts = Float.parseFloat(tekstvakRechts.getText());

            uitwerkingX = inputLinks * inputRechts;
            tekstvakRechts.setText(" ");
            tekstvakLinks.setText("Het anwoord is: " + uitwerkingX);
            System.out.println("De *-knop werkt");

            repaint();
        }
    }
    class KnopDelenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            inputLinks = Float.parseFloat(tekstvakLinks.getText());
            inputRechts = Float.parseFloat(tekstvakRechts.getText());

            uitwerkingX = inputLinks / inputRechts;
            tekstvakRechts.setText(" ");
            tekstvakLinks.setText("Het anwoord is: " + uitwerkingX);
            System.out.println("De +-knop werkt");

            repaint();
        }
    }

    class KnopMinListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            inputLinks = Float.parseFloat(tekstvakLinks.getText());
            inputRechts = Float.parseFloat(tekstvakRechts.getText());

            uitwerkingX = inputLinks - inputRechts;
            tekstvakRechts.setText(" ");
            tekstvakLinks.setText("Het anwoord is: " + uitwerkingX);
            System.out.println("De --knop werkt");

            repaint();
        }
    }




        class KnopPlusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            inputLinks = Float.parseFloat(tekstvakLinks.getText());
            inputRechts = Float.parseFloat(tekstvakRechts.getText());

            uitwerkingX = inputLinks + inputRechts;
            tekstvakRechts.setText(" ");
            tekstvakLinks.setText("Het anwoord is: " + uitwerkingX);
            System.out.println("De +-knop werkt");

            repaint();
        }
    }
}