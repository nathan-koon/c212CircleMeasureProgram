package Problem6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CircleRunner {
    private JFrame frame;
    public CircleRunner(){
        frame = new JFrame();
    }
    public void run(){
        CircleComponent circleComponent = new CircleComponent(Color.red);
        InfoDisplay infoDisplay = new InfoDisplay(circleComponent);
        frame.setTitle("Circle Viewer");
        frame.setSize(700,457);
        frame.setLayout(new BorderLayout());
        frame.add(infoDisplay, BorderLayout.NORTH);
        frame.add(circleComponent,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        circleComponent.setRadius();
        while(frame.isVisible()){
            circleComponent.repaint();
            infoDisplay.updateDisplay();
            frame.repaint();
        }
    }
}
