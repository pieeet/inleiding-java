package h11;

//Dit is het eerste deel van de praktijkopdracht van hoofdstuk 11.

//In deze opdracht ben ik flink de mist in gegaan door hem veel moeilijker te maken dan nodig was. Dit laat ik gra
//ag even staan om later nog eens op terug te kijken.

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1110 extends Applet {

    Integer tafel;
    Integer userInput;
    String sUserInput;
    TextField textFieldUI;
    Label labelTFUI;
    Button okKnop;
    Integer uitkomst1;
    Integer  antwoord;
    Integer     aX; //Aantal keer
    Integer hoogte;
    Integer h;
    Integer x;

    // check H8 voor hulp
    public void init() {

        textFieldUI = new TextField("", 20);
        labelTFUI = new Label("Kies het tafelnummer en druk op OK!");
        textFieldUI.addActionListener(new textFieldUIListener());

        okKnop = new Button("OK!");
        okKnop.addActionListener(new textFieldUIListener());
        add(textFieldUI);
        add(labelTFUI);
        add(okKnop);


    }

    public void paint(Graphics g) {

        h = 50;
        x = 50;
        g.drawString("De tafel van " + tafel + " : ", 50, 50);

        //Zolang aX 1 is, krijgt aX er elke ronde eentje bij. Zolang dit gebeurd gaat de X-as ook met 25 omhoog.
        for (aX = 1; aX < 11; aX++) {
            h += 20;
          //  antwoord = uitkomst1 * aX;
            g.drawString(""+ tafel + " x " + aX + " = " + tafel * aX, x ,h);
        }


        // deze naar boven geschoven   g.drawString("De tafel van " + tafel + " : ", 50, 50);
        //g.drawString("test1" + antwoord, 50, 100);
        //  g.drawString("test2" + antwoord, 50, 120);
        //repaint();


    }


    class textFieldUIListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            sUserInput = textFieldUI.getText();
            tafel = Integer.parseInt(sUserInput);
            System.out.println("De OK-knop werkt");
            repaint();

         //   if (tafel == 1) {
        //        uitkomst1 = 1;
        //       repaint();
        //   ;

            //Input = gelijk aan 2? Dan uitkomst = 2.
            } /*else if (tafel == 2) {
                uitkomst1 = 2;
                repaint();
             ;

             //Bij al het andere
            } else {
                uitkomst1 = 404;
                repaint();

            }*/





        }


    }
