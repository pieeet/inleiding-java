package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1005 extends Applet {

    // UserInputCijfer

    String    stekstvakCijfer;
    TextField tekstvakCijfer;
    Label     tekstvakCijferLabel;
    Double    gemiddeldeC;
    Double    behaaldeCijfer;
    Button    rekenUit;
    String    beoordelingCijfer;




    public void init() {
    tekstvakCijfer = new TextField("",20);
    tekstvakCijferLabel = new Label("Vul je cijfer in en druk op enter");
    tekstvakCijfer.addActionListener(new TekstvakCijferListener());

    rekenUit = new Button("Bereken");
    add(rekenUit);
    add(tekstvakCijfer);
    add(tekstvakCijferLabel);




    }


    public void paint(Graphics g) {

        g.drawString(beoordelingCijfer, 100,65);

    }


class TekstvakCijferListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {

        stekstvakCijfer = tekstvakCijfer.getText();
        behaaldeCijfer = Double.parseDouble(stekstvakCijfer);

        if ((behaaldeCijfer <= 5.44)) {
            beoordelingCijfer = "U heeft een onvoldoende gehaald";
            repaint();
        } else {
            beoordelingCijfer = "U heeft een voldoende gehaald";
            repaint();
        }


        }
        //einde listener

class RekenUitListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {

        stekstvakCijfer = tekstvakCijfer.getText();
        behaaldeCijfer = Double.parseDouble(stekstvakCijfer);

        // Hoe kan ik de cijfers opslaan om ze vervolgens het gemiddelde uit te rekenen?

        //






    }
}



    }


}

