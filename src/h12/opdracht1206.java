package h12;

import javax.xml.soap.Text;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht1206 extends Applet {

Integer [] cijfers = {
        1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,6,6,6,6,6,7,7,7,7,7,7,7,7,8,8,8,8,8,8,8,8,8,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9
};
Integer cijfer;
Integer teller;
String string;
TextField userInput;
Button okKnop;


    public void init() {
        userInput = new TextField("", 20);
        okKnop    = new Button("Go!");
        okKnop.addActionListener(new okKnopListener());

        cijfer = 0;
        add(userInput);
        add(okKnop);

    }


    public void paint(Graphics g) {
    teller = 0;
        for (int i = 0; i < cijfers.length ; i++) {
            if (cijfers[i] == cijfer){
                teller++;
            }
        }

        g.drawString("Het ingevoerde cijfer is: " + cijfer, 80,80);
        g.drawString("Het ingevoerde cijfer komt " + teller + " keer voor.", 80,100);
    }


    class okKnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
        string = userInput.getText();
        cijfer = Integer.parseInt(string);
        repaint();
        }
    }



}
