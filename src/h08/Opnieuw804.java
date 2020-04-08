package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opnieuw804 extends Applet {

Button deelDoor, vermenigvuldig, plus, min;
TextField eersteInput, tweedeInput;
Double eindproduct, input1, input2;

        public void init() {
            eersteInput = new TextField("", 30);
            tweedeInput = new TextField("",30);
            add(eersteInput);
            add(tweedeInput);

            deelDoor = new Button("/");
            deelDoor.addActionListener(new deelDoorAL());
            add(deelDoor);

            vermenigvuldig = new Button("*");
            vermenigvuldig.addActionListener(new vermenigvuldigAL());
            add(vermenigvuldig);

            plus = new Button("+");
            plus.addActionListener(new plusAL());
            add(plus);

            min = new Button("-");
            min.addActionListener(new minAL());
            add(min);

    }


    public void paint(Graphics g) {
    }

    class deelDoorAL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            input1 = Double.parseDouble(eersteInput.getText());
            input2 = Double.parseDouble(tweedeInput.getText());
            eindproduct = input1/input2;
            eersteInput.setText("Het antwoord op de som is: " + eindproduct);
            tweedeInput.setText(" ");

        }
    }
    class vermenigvuldigAL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            input1 = Double.parseDouble(eersteInput.getText());
            input2 = Double.parseDouble(tweedeInput.getText());
            eindproduct = input1*input2;
            eersteInput.setText("Het antwoord op de som is: " + eindproduct);
            tweedeInput.setText(" ");
        }
    }
    class plusAL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            input1 = Double.parseDouble(eersteInput.getText());
            input2 = Double.parseDouble(tweedeInput.getText());
            eindproduct = input1+input2;
            eersteInput.setText("Het antwoord op de som is: " + eindproduct);
            tweedeInput.setText(" ");
        }
    }
    class minAL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            input1 = Double.parseDouble(eersteInput.getText());
            input2 = Double.parseDouble(tweedeInput.getText());
            eindproduct = input1-input2;
            eersteInput.setText("Het antwoord op de som is: " + eindproduct);
            tweedeInput.setText(" ");
        }
    }



//einde
}
