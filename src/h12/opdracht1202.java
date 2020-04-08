package h12;

import java.applet.Applet;
import java.awt.*;

public class opdracht1202 extends Applet {

    Button [] knoppen = new Button[25];


    public void init() {
        for (int i = 0; i < 25; i++) {
        knoppen[i] = new Button(" " + (i));
        add(knoppen[i]);
        }
    }


    public void paint(Graphics g){
        }
    }
