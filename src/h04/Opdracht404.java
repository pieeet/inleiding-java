package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht404 extends Applet {

    public void init() {
    }

    public void paint(Graphics g)   {
        //Y-as
        g.drawLine(50,30,50,250);
        //X-As
        g.drawLine(50,250,250,250);

        //Schaalverdelingslijn om de 20
        g.drawLine(45,50,55,50);
        g.drawLine(45,70,55,70);
        g.drawLine(45,90,55,90);
        g.drawLine(45,110,55,110);
        g.drawLine(45,130,55,130);
        g.drawLine(45,150,55,150);
        g.drawLine(45,170,55,170);
        g.drawLine(45,190,55,190);
        g.drawLine(45,210,55,210);
        g.drawLine(45,230,55,230);

        //Namen op locatie
        g.drawString("Valerie",75,265);
        g.drawString("Jeroen",125,265);
        g.drawString("Hans",180,265);

        //Schaalverdelingstekst om de 20
        g.drawString("200",20,55);
        g.drawString("180",20,75);
        g.drawString("160",20,95);
        g.drawString("140",20,115);
        g.drawString("120",20,135);
        g.drawString("100",20,155);
        g.drawString("80",25,175);
        g.drawString("60",25,195);
        g.drawString("40",25,215);
        g.drawString("20",25,235);
        g.drawString("0",30,255);


        //Gewichtskolom Valerie - 40
        g.setColor(Color.BLUE);
        g.fillRect(80,210,30,40);

        //Gewichtskolom Jeroen - 100
        g.setColor(Color.MAGENTA);
        g.fillRect(130,150,30,100);

        //Gewichtskolom Hans
        g.setColor(Color.RED);
        g.fillRect(180,170,30,80);

    }


}
