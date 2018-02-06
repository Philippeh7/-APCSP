//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapePanel extends JPanel
{
	public ShapePanel()
	{
		setBackground(Color.WHITE);
		setVisible(true);
	}

	public void update(Graphics window)
	{
		paint(window);
	}

	/*
	 *All of your test code should be placed in paint.
	 */
	public void paint(Graphics window)
	{


		//instantiate a Shape
		//tell your shape to draw
		Shape newshape1 = new Shape(220,120,100,2,Color.RED,1); 
		newshape1.drawSmth(window);
		//instantiate a Shape
		//tell your shape to draw
		Shape newshape2 = new Shape(200,100,50,40,Color.BLUE,2); 
		newshape2.drawSmth(window);
		//instantiate a Shape
		//tell your shape to draw
		Shape newshape3 = new Shape(300,100,50,40,Color.BLUE,2); 
		newshape3.drawSmth(window);
		
		Shape newshape4 = new Shape(250,150,50,40,Color.GREEN,3); 
		newshape4.drawSmth(window);
		Shape newshape5 = new Shape(250,150,50,40,Color.YELLOW,4); 
		newshape5.drawSmth(window);
	}
}