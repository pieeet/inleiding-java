package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1003 extends Applet {
TextField inputMaand;
Label     labelMaand;
String    tekstMaand;
String    sMaand;
int       maand;




    public void init() {
        inputMaand = new TextField("", 20);
        labelMaand = new Label ("Typ het maandnummer en druk op Enter.");
        inputMaand.addActionListener(new InputMaandListener());
        tekstMaand = " ";
        add(labelMaand);
        add(inputMaand);


    }


    public void paint(Graphics g) {
        g.drawString(tekstMaand,50,100);
    }

    class InputMaandListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
     sMaand = inputMaand.getText();
     maand = Integer.parseInt( sMaand);
     switch (maand) {
         case 1:
             tekstMaand = "Januari, 31";
             break;
         case 2:
             tekstMaand = "Februari, 28 of 29";
             break;
         case 3:
             tekstMaand = "Maart 31";
         break;
         case 4:
             tekstMaand = "April 30";
             break;
         case 5:
             tekstMaand = "Mei 31";
             break;
         case 6:
             tekstMaand = "Juni 30";
             break;
         case 7:
             tekstMaand = "Juli 31";
             break;
         case 8:
             tekstMaand = "Augustus 31";
             break;
         case 9:
             tekstMaand = "September 30";
             break;
         case 10:
             tekstMaand = "Oktober 31";
             break;
         case 11:
             tekstMaand = "November 30";
             break;
         case 12:
             tekstMaand = "December 31";
             break;
         default:
             tekstMaand = "U hebt een verkeerd nummer ingetypt.";
             break;

     }
        repaint();
        }
    }








}
