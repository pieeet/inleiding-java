package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1103 extends Applet {



    public void init() {
    }


    public void paint(Graphics g) {

        int width = 50;
        int height= 50;
        int heightH=25;

        int a = 10, c1 = 0, c2 = 1;

        for (int x = 1; x <= a; ++x) {
            g.drawString(" " + c1, width, height);

            int som = c1 + c2;
            c1 = c2;
            c2 = som;

            height = heightH + height;

        }

        }







        }

