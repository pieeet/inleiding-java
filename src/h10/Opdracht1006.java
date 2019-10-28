package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1006 extends Applet {

TextField   userInputText;
Label       userInputLabel;
String      sUserInput;
String      antwoord;
Double      behaaldeCijfer;
String      fout;





    public void init() {

        userInputText = new TextField("",20);
        userInputLabel= new Label ("Vul uw cijfer in");
        userInputText.addActionListener(new UserInputTextListener());

        add(userInputLabel);
        add(userInputText);

    }


    public void paint(Graphics g) {

        g.drawString(antwoord,60,60);

    }

    class UserInputTextListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {

            sUserInput = userInputText.getText();
            behaaldeCijfer = Double.parseDouble(sUserInput);

            if ((behaaldeCijfer >= 1) && (behaaldeCijfer <= 3))
            {
                antwoord = "Uw cijfer is slecht";
                repaint();
            }
            else if ((behaaldeCijfer == 4)){
                antwoord = "Uw cijfer is onvoldoende";
                repaint();
            }
            else if ((behaaldeCijfer == 5)){
                antwoord = "Uw cijfer is matig";
                repaint();
            }
            else if ((behaaldeCijfer >=6) && (behaaldeCijfer <= 7)){
                antwoord = "Uw cijfer is voldoende";
                repaint();
            }
            else if ((behaaldeCijfer >= 8) && (behaaldeCijfer <= 10)){
                antwoord = "Uw cijfer is goed";
                repaint();
            }
            else{
                antwoord = "Er is een verkeerd cijfer ingevoerd";
                repaint();

            }

        }
    }


}
