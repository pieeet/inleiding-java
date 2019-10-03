package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht408 extends Applet {


    public void init() {

    }


    public void paint(Graphics g) {
        //Lijn.
        g.drawLine(20,20,200,20);

        //Rechthoek
        g.drawRect(20,40,180,100);

        //Afgeronde rechthoek
        g.drawRoundRect(20,160,180,100,30,30);

        //Gevulde rechthoek met ovaal
        g.setColor(Color.MAGENTA);
        g.fillRect(225,40,180,100);
        g.setColor(Color.BLACK);
        g.drawArc(225,40,180,100,0,360);

        //Gevulde ovaal
        g.setColor(Color.MAGENTA);
        g.fillArc(225,160,180,100,0,360);

        //Taartpunt met ovaal eromheen
        g.fillArc(430,40,180,100,0,45);
        g.setColor(Color.BLACK);
        g.drawArc(430,40,180,100,0,360);

        //Cirkel
        g.drawArc(465,160,100,100,0,360);

        //Tekst per verticale rij
        g.drawString("Lijn",100,35);
        g.drawString("Rechthoek",80,155);
        g.drawString("Afgeronde rechthoek",55,275);

        g.drawString("Gevulde rechthoek met ovaal",235,155);
        g.drawString("Gevulde ovaal",275,275);

        g.drawString("Taartpunt met ovaal eromheen",440,155);
        g.drawString("Cirkel",500,275);
    }

}
