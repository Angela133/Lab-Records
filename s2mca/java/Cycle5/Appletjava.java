package appletjava;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;


public class Appletjava extends Applet {

    public void paint(Graphics g){
        g.setColor(Color.blue);
        g.drawLine(20,30,20,300);
        g.drawRect(70,100,30,30);
        g.drawOval(70, 200, 30, 30);
        
    }
  
  
    
}