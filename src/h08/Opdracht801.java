package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht801 extends Applet {

    TextField tekstvak;
    Button knopOK;
    Button knopReset;
    String message;


    public void init() {

        setSize(400,500);

        tekstvak = new TextField(20);
        tekstvak.addActionListener(new KnopOKListener());
        add(tekstvak);

        knopOK   = new Button("OK");
        knopOK.addActionListener(new KnopOKListener());
        add(knopOK);

        knopReset= new Button("Reset");
        knopReset.addActionListener(new KnopResetListener());
        add(knopReset);

        message = "Er is nog niets getypt.";
    }

    public void paint(Graphics g) {
        g.drawString(message,20,150);

    }
    class KnopOKListener implements ActionListener {


        public void actionPerformed(ActionEvent e) {

           message = tekstvak.getText();
           repaint();

        }
    }

    class KnopResetListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
           tekstvak.setText(" ");
        }
}



}
