package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht1205 extends Applet {

    TextField userInput;
    Button okKnop;
    Integer cijfer;
    Boolean aBoolean;
    String string;
    Integer test;

    Integer y;


    Integer [] cijfers =
            {
                    1,2,3,4,5,6,7,8,9,10
            };


    public void init() {
        okKnop = new Button("OK!");
        userInput = new TextField("",10);
        okKnop.addActionListener(new okKnopListener());
        add(okKnop);
        add(userInput);
    }


    public void paint(Graphics g) {
        y = 80;
        aBoolean = false;
        for (int i = 0; i < cijfers.length; i++) {
            if (cijfers[i] == cijfer) {
                aBoolean = true;
                break;
            }
        }


        //Wanneer test gewoon "i" is pakt ie hem bij regel 50 niet "cannot resolve symbol". Eerst declareren aan het
        //begin en daarna pakt ie hem wel. Waarom?
        if (aBoolean) {
            g.drawString("Je cijfer is: " + cijfer, 80, 80);
            for (int test = 0; test < cijfers.length; test++) ;
            {
                g.drawString(" " + cijfers[test], 80, y);
                y += 20;
            }
        } else {
            g.drawString("Je cijfer zit er niet tussen.", 80, 80);
        }
    }


    class okKnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            string = userInput.getText();
            cijfer = Integer.parseInt(string);
            repaint();
        }
    }
}
