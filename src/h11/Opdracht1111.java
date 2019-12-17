package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1111 extends Applet {
// Een knop die als Actionhandler heeft dat ie x- een +1 geeft waardoor de switch statement weer veranderd
// Of een knop die iets met een for a=0;a<10;++ iets maakt.
// IF OK-gedrukt tafel= tafel+1.
    //.........

    Integer tafel;
    Integer h;
    Integer x;
    Integer aX;
    Button okKnop;




    public void init() {

    setSize(500,500);

    okKnop = new Button("Volgende");
    okKnop.addActionListener(new ButtonOKListener());
    add(okKnop);


    }

    public void paint(Graphics g) {


      g.drawString("Sommetje" + tafel, 50,50);
      g.drawString("sommetje23" + tafel, 60,60);
      g.drawString("Somme2323tje" + tafel,75,75);
      g.drawString("3434343434" + (tafel * 3),100,100);
        repaint();
        }

        class ButtonOKListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                System.out.println("De OK-knop werkt");
                tafel++;
                repaint();
            }

    }




}