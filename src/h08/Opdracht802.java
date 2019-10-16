package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht802 extends Applet {
    Button knopM;
    Button knopV;
    Button knopG;
    Button knopB;

    String message;

    int aantalV;
    int aantalM;
    int aantalB;
    int aantalG;
    int bezoekersTotaal;

    public void init() {


        setSize(400, 400);

        knopV = new Button("Vrouw");
        knopV.addActionListener(new ButtonVListener());
        add(knopV);

        knopM = new Button("Man");
        knopM.addActionListener(new ButtonMListener());
        add(knopM);

        knopG = new Button ("Meisje");
        knopG.addActionListener(new ButtonGListener());
        add(knopG);

        knopB = new Button("Jongen");
        knopB.addActionListener(new ButtonBListener());
        add(knopB);

        bezoekersTotaal = aantalB + aantalG + aantalV + aantalM;
    }

    public void paint(Graphics g) {
       g.drawString("Het aantal vrouwen is: "+aantalV, 50,50);
       g.drawString("Het aantal mannen is: " +aantalM,50,65);
       g.drawString("Het aantal jongens is: "+aantalB,50,80);
       g.drawString("Het aantal meisjes is: "+aantalG,50,95);
       g.drawString("Totaal aantal bezoekers: "+bezoekersTotaal,50,110);

    }

    class ButtonVListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            System.out.println("De V-knop werkt!");
         aantalV++;
        bezoekersTotaal++;
        repaint();
        }
    }
    class ButtonMListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("De M-knop werkt!");
         aantalM++;
         bezoekersTotaal++;
         repaint();
        }
    }
    class ButtonBListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("De B-knop werkt!");
         aantalB++;
         bezoekersTotaal++;
         repaint();
        }
    }
    class ButtonGListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("De G-knop werkt!");
         aantalG++;
         bezoekersTotaal++;
         repaint();

        }
    }

}
