package H6;

import java.applet.Applet;
import java.awt.*;

public class Opdracht602 extends Applet {

int     uurSeconden;
int     dagSeconden;
int     jaarSeconden;


    //Hoeveel uren in een uur, dag en jaar uitkomst printen in applet


    public void init() {



    uurSeconden = 60 * 60;
    dagSeconden = 24 * uurSeconden;
    jaarSeconden = 365 * dagSeconden;


    }


    public void paint(Graphics g) {
    g.drawString("Seconden per uur: "+uurSeconden,50,60);
    g.drawString("Seconden per dag: "+dagSeconden,50,75);
    g.drawString("Seconden per jaar: "+jaarSeconden,50,90);


    }
}
