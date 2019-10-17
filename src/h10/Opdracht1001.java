package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1001 extends Applet {

TextField   userInputField;
boolean     eersteGetal;
String      sorry;

int     laagsteGetal;
int     hoogsteGetal;
int     userInput;


    public void init() {

        userInputField = new TextField(20);
        userInputField.addActionListener(new UserInputListener());
        add(userInputField);

        sorry = "";
        hoogsteGetal = 0;
        laagsteGetal = 0;
        eersteGetal = true;



    }


    public void paint(Graphics g) {
  g.drawString("Hoogste getal: " + hoogsteGetal,70,90);
  g.drawString("Laagste getal: " + laagsteGetal,70,110);
  g.drawString("" + sorry, 70,130);

    }

    class UserInputListener implements  ActionListener{
        public void actionPerformed(ActionEvent e) {
            String userInputString = userInputField.getText();
            userInput = Integer.parseInt(userInputString);
            if (eersteGetal) {
                eersteGetal = false;
                hoogsteGetal = userInput;
                laagsteGetal = userInput;
                repaint();
            } else {
                if (userInput > hoogsteGetal) {
                    hoogsteGetal = userInput;
                    sorry = "";
                    repaint();
                }
                else if (userInput < laagsteGetal) {
                    laagsteGetal = userInput;
                    sorry = "";
                    repaint();
                }
                else {
                    sorry ="Sorry, maar " + userInput + " is niet hoger dan " + hoogsteGetal + "en niet lager dan " +
                             laagsteGetal;
                    repaint();


                }
            repaint();


        }
    }




}
}
