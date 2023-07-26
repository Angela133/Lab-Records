package color;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class colorjava  extends Applet implements MouseListener {
    private Color doorColor = Color.BLUE;
    
    public void init() {
        setSize(400, 400);
        addMouseListener(this);
    }

    public void paint(Graphics g) {
        drawHouse(g);
    }

    public void drawHouse(Graphics g) {
        
        g.setColor(Color.orange);
        g.fillRect(100, 200, 200, 150);

        
        int[] xPoints = {100, 200, 300};
        int[] yPoints = {200, 100, 200};
        g.setColor(Color.GRAY);
        g.fillPolygon(xPoints, yPoints, 3);

       
        g.setColor(doorColor);
        g.fillRect(180, 250, 40, 100);

        
        g.setColor(Color.WHITE);
        g.fillRect(120, 230, 50, 50);
        g.fillRect(230, 230, 50, 50);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Check if the mouse click is within the door region
        int mouseX = e.getX();
        int mouseY = e.getY();
        if (mouseX >= 180 && mouseX <= 220 && mouseY >= 250 && mouseY <= 350) {
            // Toggle door color between blue and red
            doorColor = (doorColor == Color.BLUE) ? Color.RED : Color.BLUE;
            repaint(); // Trigger a repaint to update the door color
        }
    }

    // Other MouseListener methods (not used in this example)
    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
}

    
