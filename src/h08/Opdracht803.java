package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht803 extends Applet {

TextField   tekstvak;
Label       label;
Button      buttonOK;
String      message;

Double      inclBTW;
Double      exclBTW;
Double      userInput;



        public void init() {

            setSize(400,400);

            tekstvak = new TextField(20);
            tekstvak.addActionListener(new ButtonOKListener());
            label = new Label("Type iets in het tekstvak en druk op enter.");
            add(label);
            add(tekstvak);


            buttonOK = new Button("OK!");
            buttonOK.addActionListener(new ButtonOKListener());
            add(buttonOK);

                //probeersel!@#
            //ButtonOKListener BOL = new ButtonOKListener();
           // buttonOK.addActionListener(BOL);

            //exclBTW =

            //inclBTW = userInput * 1.21;
    }

    public void paint(Graphics g) {
            g.drawString("Het bedrag inclusief BTW is: " + inclBTW, 95,70);

            //g.drawString(inclBTW, 200,50);
           // String.valueOf(inclBTW,200,200);


    }

    class ButtonOKListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            userInput = Double.parseDouble(tekstvak.getText());
            inclBTW   = userInput * 1.21;

            System.out.println("De OK-button werkt!");
            repaint();



        }
    }


}
