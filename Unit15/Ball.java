//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block implements Collidable
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	
	
	public Ball(int x, int y)
	{
		super(x,y);
		xSpeed = 3;
		ySpeed = 1;

	}
	
	public Ball(int x, int y, int w, int h)
	{
		super(x,y,w,h);
		xSpeed = 3;
		ySpeed = 1;

	}
	
	public Ball(int x, int y, int w, int h, Color col)
	{
		super(x,y,w,h,col);
		xSpeed = 3;
		ySpeed = 1;

	}
	
	public Ball(int x, int y, int w, int h, Color col, int xs, int ys)
	{
		super(x,y,w,h,col);
		xSpeed = xs;
		ySpeed = ys;

	}
	
	public void setxspeed(int x){
		xSpeed = x;
	}
	
	public void setyspeed(int y){
		ySpeed = y;
	}
	
	   
   //add the set methods
   

   public void moveAndDraw(Graphics window)
   {
	  window.fillOval(getX(), getY(), getwidth(), getheight());


      setX(getX()+xSpeed);
      setY(getY()+ySpeed);

      window.fillOval(getX(), getY(), getwidth(), getheight());
   }
   
	public boolean equals(Ball obj)
	{
		if(obj.getxspeed() == xSpeed && obj.getyspeed() == ySpeed)
			return true;



		return false;
	}   

   //add the get methods
	public int getxspeed(){
		return xSpeed;
	}
	
	public int getyspeed(){
		return ySpeed;
	}
	
	public boolean didCollideLeft(Ball obj){
		if(obj.getX() == getX() && obj.getheight() >= getY() && obj.getheight() <= getY()){
			return true;
		}
		
		return false;

	}
	
	public boolean didCollideRight(Ball obj){
		if(obj.getX() == getX() && obj.getheight() >= getY() && obj.getheight() <= getY()){
			return true;
		}
		
		return false;

	}
	
	public boolean didCollideTop(Ball obj){
		if(obj.getX() == getX() && obj.getheight() >= getY() && obj.getheight() <= getY()){
			return true;
		}
		
		return false;

	}

	
	public String toString(){
		return getX() + ", " + getY() + ", " + + getwidth() + ", " + + getheight() + ", " + getcolor() + ", " +  xSpeed + ", " + ySpeed;
	}
}