package H6;

import java.applet.Applet;
import java.awt.*;

public class Opdracht601 extends Applet {

    // hier declareren
    double totaalBedrag;
    double bedragPP;
    int aantalWerkers;



    public void init() {

      totaalBedrag  =   113;
      aantalWerkers =     4;
      bedragPP      =   totaalBedrag / aantalWerkers;


    }

    public void paint(Graphics g) {
        g.drawString("Jan: " + bedragPP, 50,50);
        g.drawString("Ali: " + bedragPP, 50,65);
        g.drawString("Jeanette: "  + bedragPP, 50,80);
        g.drawString("Mark: " + bedragPP, 50,95);



    }
}
