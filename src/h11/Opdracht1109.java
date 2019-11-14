package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1109 extends Applet {


    public void init() {
        setSize(500, 500);
    }


    public void paint(Graphics g) {

        int x = 50;
        int y = 50;
        int width = 50;
        int height = 50;

        for (int i = 0; i < 8; i++) {

            if (i == 0 || i == 2 || i == 4 || i == 6) {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, width, height);
            }

            for (int j = 0; j < 8; j++) {
                if (j == 0 || j == 2 || j == 4 || j == 6)
                if (i == 0 || i == 2 || i == 4 || i == 6)
                {
                    g.setColor(Color.BLACK);
                    g.fillRect(x,y,width,height);
                }



                if ( j == 1 || j == 3 || j == 5 || j == 7)
                if ( i == 1 || i == 3 || i == 5 || i == 7)
                {
                    g.setColor(Color.BLACK);
                    g.fillRect(x,y,width,height);

                }

                g.drawRect(x, y, width, height);
                x += width;
            }


                x = 50;
                y += height;


            }
        }
    }
