package h08;
/* Vragen hoofdstuk 8:
Wat is event-handling?
- Events zijn gebeurtenissen die de computer afhandelt.  In geval van event handling stuurt de computer de gebeurtenis
door naar de bijbehorende methode.
Wat is een gebruikersinterface?
- Gebruikersinterface is wat de gebruiker op zijn of haar scherm ziet.
Waarom moet er voor een knop wel en voor een tekst geen event-handling geprogrammeerd worden?
- Omdat je van tekst een waarde kunt maken, maar niet van een muisklik.
Wat is een lege string?
-Een string is een een stuk tekst die je kan aanroepen met bepaalde code. Maar deze tekst hoeft niet gevuld te zijn. Dan
krijg je dus niets te zien; een lege string dus.
Wat is het verschil tussen een tekstvak en een label?
- Als gebruiker kun je iets invullen in een tekstvak. Dit kan niet met een label.
Waarom moeten getallen uit een tekstvak altijd geconverteerd worden naar een double of een int?
- Geen idee. Ik heb dit in 804 niet gedaan en hij werkt. Waarom?




 */
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht801 extends Applet {

    TextField tekstvak;
    Button knopOK;
    Button knopReset;
    String message;


    public void init() {

        setSize(400,500);

        tekstvak = new TextField(20);
        tekstvak.addActionListener(new KnopOKListener());
        add(tekstvak);

        knopOK   = new Button("OK");
        knopOK.addActionListener(new KnopOKListener());
        add(knopOK);

        knopReset= new Button("Reset");
        knopReset.addActionListener(new KnopResetListener());
        add(knopReset);

        message = "Er is nog niets getypt.";
    }

    public void paint(Graphics g) {
        g.drawString(message,20,150);

    }
    class KnopOKListener implements ActionListener {


        public void actionPerformed(ActionEvent e) {

           message = tekstvak.getText();
           repaint();

        }
    }

    class KnopResetListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
           tekstvak.setText(" ");
        }
}



}
