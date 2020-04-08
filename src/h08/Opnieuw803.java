package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opnieuw803 extends Applet {
    String message;
    Button ok, reset;
    TextField userInput;
    Double inclbtw;
    Double geparsed;



    public void init() {
        userInput = new TextField("Geef hier uw input");
        userInput.addActionListener(new okKnopL());
        add(userInput);

        ok = new Button("OK!");
        ok.addActionListener(new okKnopL());
        add(ok);

        reset = new Button("RESET!");
        reset.addActionListener(new resetKnopL());
        add(reset);


    }

    public void paint(Graphics g) {
        g.drawString("Het opgegeven bedag inclusief btw is: "  + inclbtw, 50,50);

    }


    class okKnopL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
           geparsed = Double.parseDouble(userInput.getText());
           inclbtw = geparsed * 1.21;
           repaint();
        }
    }

    class resetKnopL implements ActionListener{
        public void actionPerformed(ActionEvent e){
        userInput.setText("Vul het bedrag in waarvan u de BTW wilt berekenen");
        repaint();
        }
    }

}
