package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opnieuw106 extends Applet {

Button okKnop;
TextField userInput;
String resultaat, resultaatString;
Integer behaaldeCijfer;

    public void init() {

        userInput = new TextField("Typ hier het behaalde cijfer in");
        userInput.addActionListener(new okKnopAL());
        add(userInput);

        okKnop = new Button("OK!");
        okKnop.addActionListener(new okKnopAL());
        add(okKnop);



    }
    public void paint(Graphics g) {
        g.drawString(resultaatString, 50,50);
    }


    class okKnopAL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            behaaldeCijfer = Integer.parseInt(userInput.getText());
            System.out.println("" + behaaldeCijfer);

            if (behaaldeCijfer == 1 || behaaldeCijfer == 2 || behaaldeCijfer == 3){
                resultaat = "slecht";
            } else if (behaaldeCijfer == 4) {
                resultaat = "onvoldoende";
                resultaatString = "Het behaalde cijfer is " + behaaldeCijfer + ". Dit is een " + resultaat + " resultaat.";
            } else if (behaaldeCijfer == 5) {
                resultaat = "matig";
                resultaatString = "Het behaalde cijfer is " + behaaldeCijfer + ". Dit is een " + resultaat + " resultaat.";
            } else if (behaaldeCijfer == 6 || behaaldeCijfer == 7){
                resultaat = "voldoende";
                resultaatString = "Het behaalde cijfer is " + behaaldeCijfer + ". Dit is een " + resultaat + " resultaat.";
            } else if (behaaldeCijfer == 8 || behaaldeCijfer == 9 || behaaldeCijfer == 10) {
                resultaat = "goed";
                resultaatString = "Het behaalde cijfer is " + behaaldeCijfer + ". Dit is een " + resultaat + " resultaat.";
            } else {resultaatString = "Er is een verkeerd cijfer ingevoerd.";}
            repaint();
        }
    }






}
