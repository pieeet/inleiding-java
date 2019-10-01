package h02;

import java.awt.*;
import java.applet.*;
/* Vragen Hoofdstuk 2
    1: Machinetaal is computertaal; nullen en enen.
    2: Een editor om de code mee te schrijven, een compiler om de code te vertalen naar machine taal en
    als laatst heb je een linker nodig.
    3: Vrijwel alles wat in het blauw is dikgedrukt is een opdracht.
    4: Het importeren van beschikbare software uit je bibliotheek.
    5: Een methode is een verzameling opdrachten onder een naam.
 */


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
