//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );

      //call head method
      head(window);
      //call other methods
      upperBody(window);
      lowerBody(window);
   }

   public void head( Graphics window )
   {
     
      Shape head = new Shape(300,100,50,50,Color.RED,2);
	   head.drawSmth(window);

		//add more code here
				
   }

   public void upperBody( Graphics window )
   {
	   Shape upperbod = new Shape(305,150,40,80,Color.BLUE,1);
	   upperbod.drawSmth(window);
	   
	   Shape upperbod1 = new Shape(345,175,25,8,Color.GREEN,1);
	   upperbod1.drawSmth(window);
	   
	   Shape upperbod2 = new Shape(280,175,25,8,Color.GREEN,1);
	   upperbod2.drawSmth(window);
   }
   

   public void lowerBody( Graphics window )
   {
	   Shape lowerbod = new Shape(305,220,10,50,Color.GREEN,1);
	   lowerbod.drawSmth(window);
	   
	   Shape lowerbod2 = new Shape(335,220,10,50,Color.GREEN,1);
	   lowerbod2.drawSmth(window);

   }
}