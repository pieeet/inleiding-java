package h11;

/*Vragen hoofdstuk 11
1. Een For is de kortere versie van de While
2. Lussen zijn eigenlijk statements in statements in statements.
3. Nee, hij eigenlijk zegt "wanneer 10 kleiner is als 5 dan..." en dat is het niet.

 */


import java.applet.Applet;
import java.awt.*;

public class Opdracht1101 extends Applet {
    public void init() {
    setSize(500,500);

    }

    public void paint(Graphics g) {
       int x = 0;

        for (int i = 0; i < 10; i++){
            x += 20;
            g.drawLine(x, 50, x,200);
            ;
        }

    }
}
