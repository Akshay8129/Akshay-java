// Java program to draw a line in Applet

import java.awt.*;
import javax.swing.*;
import java.awt.geom.Line2D;

class MyCanvas extends JComponent {

	public void paint(Graphics g)
	{

		// draw and display the line
		 
		g.drawLine(30, 20, 80, 90);
		g.drawRect(320, 50, 100, 100);
		
		g.drawOval(85, 250, 150, 150);
	g.setColor(Color.YELLOW);
 	g.fillOval(80, 70, 150, 150);
// Arc for the smile
	g.setColor(Color.BLACK);
        g.fillArc(130, 180, 50, 20, 50, 100);
 
        // Ovals for eyes
        // with black color filled
        g.setColor(Color.BLACK);
        g.fillOval(120, 120, 15, 15);
        g.fillOval(170, 120, 15, 15);
 
        

		
	}
}

public class line {
	public static void main(String[] a)
	{

		// creating object of JFrame(Window popup)
		JFrame window = new JFrame();

		// setting closing operation
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// setting size of the pop window
		window.setBounds(100, 100, 200, 200);

		// setting canvas for draw
		window.getContentPane().add(new MyCanvas());

		// set visibility
		window.setVisible(true);
	}
}
