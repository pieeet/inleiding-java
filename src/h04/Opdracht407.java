package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht407 extends Applet {

    public void init (){

    }


    public void paint(Graphics g) {
    g.drawRoundRect(50,50,50,50,20,20);
        g.fillArc(60,60,10,10,0,360);
        g.fillArc(60,80,10,10,0,360);
        g.fillArc(80,60,10,10,0,360);
        g.fillArc(80,80,10,10,0,360);



    }
}
