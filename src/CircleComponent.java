package Problem6;

import javax.swing.*;
import java.awt.*;

public class CircleComponent extends JPanel {
    private double radius;
    private Color circleColor;

    public CircleComponent(Color circleColor){
        this.radius = 0;
        this.circleColor = circleColor;
    }

    public void paintGrid(Graphics g){
        g.setColor(Color.GRAY);
        int width = getWidth();
        int height = getHeight();
        for(int i = 0; i < width; i += 50){
            g.drawLine(i,0,i,height);
            g.drawString("" + i, i,50);
        }
        for(int i = 0; i < height; i += 50){
            g.drawLine(0,i,width,i);
            g.drawString("" + (i-50), 0,i);
        }

    }

    public void setRadius(){
        this.radius = Integer.parseInt(JOptionPane.showInputDialog("Enter Radius: "));
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        this.paintGrid(g);
        int centerX = width/2;
        int centerY = height/2;
        int x = (int)(centerX - this.radius);
        int y = (int)(centerY - this.radius);
        g.setColor(this.circleColor);
        g.fillOval(x,y,(int)this.radius*2,(int)this.radius*2);
    }

    public double getRadius(){
        return this.radius;
    }
}
