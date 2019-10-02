package h04;

import java.awt.*;
import java.applet.*;


public class Opdracht402 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
    //Basis v/h huis
   g.drawRect(150,199,100,100);
   //Dak
   g.drawLine(100,199,300,199);
   g.drawLine(100,199,200,100);
   g.drawLine(300,200,200,100);
   //Deur
   g.drawRect(160,250,30,50);
   //Raam
   g.drawRect(210,250,30,30);
   //Deurklink
   g.drawLine(182,280,180,282);
   g.drawLine(180,280,182,282);
    }
}