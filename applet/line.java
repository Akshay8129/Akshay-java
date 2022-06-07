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
		
		g.drawOval(200, 200, 150, 150);

		g.fillOval(120, 120, 15, 15);
        	g.fillOval(170, 120, 15, 15);
		g.drawArc(130, 180, 50, 20, 180, 180);
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
		window.setBounds(30, 30, 200, 200);

		// setting canvas for draw
		window.getContentPane().add(new MyCanvas());

		// set visibility
		window.setVisible(true);
	}
}
