package H6;
/*
1. Waarom is initialiseren van variabelen noodzakelijk?
Door het initialiseren van variabelen weet je welke waarde er in een variabele staat.
2. Waarom is er typecasting noodzakelijk bij de conversie van een double naar een int?
Omdat een int een heel getal moet zijn, en een double mag achter de komma werken.
3. Wat is de uitvoer van dit programma? Geef een verklaring
A = 8, B = 8 & C = 3. De uitkomst is A+B en dan vervolgens delen door C. Omdat het een double is
wordt hij naar beneden afgerond op ,0 achter de komma. Het antwoord is dan ook 5,0.
4 & 5 =
Dan is het antwoord 10.



*/

import java.applet.Applet;
import java.awt.*;

public class H6Praktijkopdracht extends Applet {

    double getal1;
    double getal2;
    double getal3;

    double uitkomst;

    public void init() {
        //getallen
    getal1 = 5.9;
    getal2 = 6.3;
    getal3 = 6.9;

    uitkomst = (getal1 + getal2 + getal3) / 3;
    uitkomst *= 10;
    uitkomst = (int) uitkomst;
    uitkomst = uitkomst / 10;
    }


    public void paint(Graphics g) {

        g.drawString(String.valueOf("Het gemiddelde is: " + uitkomst), 50,50);

    }
}
