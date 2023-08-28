package Problem6;

import javax.swing.*;
import java.awt.*;

public class InfoDisplay extends JPanel {
    private JLabel display;
    private JButton button;
    private CircleComponent circleComponent;
    public InfoDisplay(CircleComponent circleComponent){
        this.setLayout(new BorderLayout());
        this.circleComponent = circleComponent;
        this.display = new JLabel();
        this.button = new JButton("Change Radius");
        this.add(display);
        this.add(button, BorderLayout.EAST);
        button.addActionListener(e ->{
            circleComponent.setRadius();
        });
    }
    public void updateDisplay(){
        double val = Math.PI*Math.pow(circleComponent.getRadius(),2);
        val = val*1000;
        val = (int) val;
        val /= 1000;
        double val2 = 2*Math.PI*circleComponent.getRadius();
        val2 = val2*1000;
        val2 = (int) val2;
        val2 /= 1000;
        this.display.setText("Radius: " + circleComponent.getRadius()+ "             Area: " + val + "             Circumference: " + val2);
        this.repaint();
    }

}
