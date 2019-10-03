package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht406 extends Applet {

    public void init (){

    }

    public void paint (Graphics g) {

        g.fillRoundRect(150,50,100,240,25,20);

        g.setColor(Color.GREEN);
        g.fillArc(170,65,60,60,0,360);

        g.setColor(Color.ORANGE);
        g.fillArc(170,135,60,60,0,360);

        g.setColor(Color.RED);
        g.fillArc(170,205,60,60,0,360);
    }


}
