package h02;

import java.awt.*;
import java.applet.*;



public class opdracht2 extends Applet {

    public void init(){
        setBackground(Color.WHITE);

    }
    public void paint(Graphics g){

        g.setColor(Color.BLUE);
        g.drawString("Mark", 50,60);

        g.setColor(Color.RED);
        g.drawString("Bijl", 50,70);

    }
}
