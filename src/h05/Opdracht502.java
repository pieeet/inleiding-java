package h05;

import java.applet.Applet;
import java.awt.*;

public class Opdracht502 extends Applet {

    int gewichtValerie;
    int hoogteXas;
    int gewichtJeroen;
    int gewichtHans;




    public void init() {

        // Variabelen initialiseren

        gewichtValerie = 45;
        gewichtHans =   80;
        gewichtJeroen = 100;
        hoogteXas = 350;



        setSize(400,400);

    }


    public void paint(Graphics g) {
        //Verticale as
        g.drawLine(50,50,50,hoogteXas);
        //Horizontale as
        g.drawLine(50,hoogteXas,hoogteXas,hoogteXas);

        //Tekenen van de staven
            // Valerie 45 kg
        g.setColor(Color.BLUE);
        g.fillRect(50,hoogteXas - gewichtValerie, 80, gewichtValerie);
            // Jeroen 100 kg
        g.setColor(Color.MAGENTA);
        g.fillRect(150,hoogteXas - gewichtJeroen,80,gewichtJeroen);
            // Hans 80 kg
        g.setColor(Color.RED);
        g.fillRect(250,hoogteXas - gewichtHans, 80,gewichtHans);

        g.drawLine(45,330,55,330);
        g.drawLine(45,310,55,310);
        g.drawLine(45,290,55,290);
        g.drawLine(45,270,55,270);
        g.drawLine(45,250,55,250);
        g.drawLine(45,230,55,230);
        g.drawLine(45,210,55,210);
        g.drawLine(45,190,55,190);
        g.drawLine(45,170,55,170);
        g.drawLine(45,150,55,150);
        g.drawLine(45,130,55,130);
        g.drawLine(45,110,55,110);
        g.drawLine(45,90,55,90);
        g.drawLine(45,70,55,70);


        //Verticale as KGs
        g.drawString("280",20,75);
        g.drawString("260",20,95);
        g.drawString("240",20, 115);
        g.drawString("220",20,135);
        g.drawString("200",20,155);
        g.drawString("180",20,175);
        g.drawString("160",20,195);
        g.drawString("140",20,215);
        g.drawString("120",20,235);
        g.drawString("100",20,255);
        g.drawString("80",25,275);
        g.drawString("60",25,295);
        g.drawString("40",25,315);
        g.drawString("20",25,335);
        g.drawString("0",30,355);

        //Namen op locatie
        //Namen op locatie
        g.drawString("Valerie",75,365);
        g.drawString("Jeroen",270,365);
        g.drawString("Hans",175,365);

    }

}
