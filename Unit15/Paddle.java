//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
		super(10,10);
      speed =5;
   }
   public Paddle(int x, int y)
	{
		super(x,y);
		speed = 3;
		

	}
   public Paddle(int x, int y, int s)
	{
		super(x,y);
		speed = s;
		

	}
	
	public Paddle(int x, int y, int w, int h)
	{
		super(x,y,w,h);
		speed = 3;
		

	}
	
	public Paddle(int x, int y, int w, int h, Color col)
	{
		super(x,y,w,h,col);
		speed = 3;
		

	}
	
	public Paddle(int x, int y, int w, int h, int s)
	{
		super(x,y,w,h);
		speed = s;
		
	}
	
	public Paddle(int x, int y, int w, int h, Color col, int s)
	{
		super(x,y,w,h,col);
		speed = s;
		
	}


   //add the other Paddle constructors


	public void setspeed(int s){
		speed = s;
	}







   public void moveUpAndDraw(Graphics window)
   {
	   window.fillRect(getX(), getY(), getwidth(), getheight());
	   setY(getY() - speed);
	   window.fillRect(getX(), getY(), getwidth(), getheight());
   }

   public void moveDownAndDraw(Graphics window)
   {
	   window.fillRect(getX(), getY(), getwidth(), getheight());
	   setY(getY() + speed);
	   window.fillRect(getX(), getY(), getwidth(), getheight());

   }

   //add get methods
   
   public int setspeed(){
		return speed;
	}
   
   
   //add a toString() method
   public String toString(){
		return getX() + ", " + getY() + ", " + + getwidth() + ", " + + getheight() + ", " + getcolor() + ", " +  speed;
	}
}