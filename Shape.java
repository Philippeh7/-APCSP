//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Shape
{
   //instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;
	private int choice;

   public Shape(int x, int y, int wid, int ht, Color col,int choice2)
   {
		xPos = x;
		yPos = y;
		width = wid;
		height = ht;
		color = col;
		choice = choice2;
		//finish this constructor
   }


   public void drawSmth(Graphics window)
   {
	  window.setColor(color);
	  if(choice == 1)
	  {
      window.fillRect(xPos, yPos, width, height);
	  }
	  if(choice == 2)
	  {
      window.fillOval(xPos, yPos, width, height);
	  }
	  if(choice == 3)
	  {
	  window.fillArc(xPos, yPos, width, height, 0, 90);
	  }
	  if(choice == 4)
	  {
	  window.fillArc(xPos, yPos, width, height, 180, 90);
	  }
      
      //draw whatever you want
      //    ^
      //  [ :: ]
      //    ()

   }
   
   public void setxPos (int x)
   {
	   xPos=x;
   }
   public void setyPos (int x)
   {
	   xPos=x;
   }
   public void setwidPos (int x)
   {
	   width=x;
   }
   public void setheightPos (int x)
   {
	   height=x;
   }
   public void setchoice (int x)
   {
	   choice=x;
   }
   public void setcolor (Color col)
   {
	   color = col;
   }
   
   public int returnxPos()
   {
	   return xPos;
   }
   public int returnyPos()
   {
	   return yPos;
   }
   public int returnht()
   {
	   return height;
   }
   public int returnwidth()
   {
	   return width;
   }
   public int returnchoice()
   {
	   return choice;
   }
   public Color returncolor()
   {
	   return color;
   }

   //BONUS
   //add in set and get methods for all instance variables

   public String toString()
   {
   	return xPos+" "+yPos+" "+width+" "+height+" "+color;
   }
}