package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1004 extends Applet {
    TextField inputMaand;
    Label     labelMaand;
    String    tekstMaand;
    String    sMaand;
    int       maand;

    TextField inputJaar;
    Label     labelJaar;
    String    tekstJaar;
    String    sJaar;
    int       jaar;




    public void init() {
        inputMaand = new TextField("", 20);
        labelMaand = new Label ("Typ het maandnummer en druk op Enter.");
        inputMaand.addActionListener(new InputMaandListener());
        tekstMaand = " ";
        add(labelMaand);
        add(inputMaand);

        inputJaar = new TextField("",20);
        labelJaar = new Label ("Typ het jaartal en druk op Enter.");
        inputJaar.addActionListener(new InputJaarListener());
        tekstJaar = " ";
        add(labelJaar);
        add(inputJaar);


    }


    public void paint(Graphics g) {
        g.drawString(tekstMaand,50,100);
        g.drawString(tekstJaar, 50,130);

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
                    tekstMaand = "U heeft een verkeerd nummer ingetypt.";
                    break;

            }
            repaint();
        }
    }

    class InputJaarListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {

       sJaar = inputJaar.getText();
       jaar  = Integer.parseInt(sJaar);

        if ((jaar % 4 == 0 && !(jaar % 100 == 0)) || jaar % 400 == 0) {
            tekstJaar =""+ jaar + " is een schrikkeljaar";
            repaint();

       } else {
            tekstJaar = "" + tekstJaar + "is geen schrikkeljaar.";
            repaint();
        }



        repaint();
        }
    }

















}
