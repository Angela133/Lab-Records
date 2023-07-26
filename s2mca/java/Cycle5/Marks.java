package marks;

 import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Font;

public class Marks  extends Applet {
    private int[] marks = {85, 78, 92, 64, 70}; 
    private int maxMarksPerSubject = 100;

    public void paint(Graphics g) {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

        int totalMaxMarks = marks.length * maxMarksPerSubject;
        double percentage = ((double) totalMarks / totalMaxMarks) * 100;

        String result = "Percentage of marks obtained: " + String.format("%.2f", percentage) + "%";
        String face = (percentage > 50) ? "Happy face 😄" : "Sad face 😞";

        g.setFont(new Font("Arial", Font.PLAIN, 16));
        g.drawString(result, 20, 30);
        g.drawString(face, 20, 50);
    }
}