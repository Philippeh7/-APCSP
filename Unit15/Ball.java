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
	public Ball(int x, int y, int w, int h, int xs, int ys)
	{
		super(x,y,w,h);
		xSpeed = xs;
		ySpeed = ys;

	}
	
	public Ball(int x, int y, int w, int h, Color col, int xs, int ys)
	{
		super(x,y,w,h,col);
		xSpeed = xs;
		ySpeed = ys;

	}
	
	public void setXSpeed(int x){
		xSpeed = x;
	}
	
	public void setYSpeed(int y){
		ySpeed = y;
	}
	
	   
   //add the set methods
   

   public void moveAndDraw(Graphics window)
   {
	  window.setColor(getcolor());
	  window.fillOval(getX(), getY(), getwidth(), getheight());
	  Ball repeat =  new Ball(getX(),getY(),getwidth(),getheight(),Color.WHITE,getXSpeed(),getYSpeed());
      setX(getX()+xSpeed);
      setY(getY()+ySpeed);
      window.setColor(repeat.getcolor());
      window.fillOval(repeat.getX(), repeat.getY(), repeat.getwidth(), repeat.getheight());
      window.setColor(getcolor());
      window.fillOval(getX(), getY(), getwidth(), getheight());
   }
   
	public boolean equals(Ball obj)
	{
		if(obj.getXSpeed() == xSpeed && obj.getYSpeed() == ySpeed)
			return true;



		return false;
	}   

   //add the get methods
	public int getXSpeed(){
		return xSpeed;
	}
	
	public int getYSpeed(){
		return ySpeed;
	}
	
	public boolean didCollide(Paddle obj){
		if(obj.getX() + obj.getwidth()/2 >= getX() && obj.getX() - obj.getwidth()/2 <= getX() && obj.getY() + obj.getheight()/2 >= getY() && obj.getY() - obj.getheight()/2 <= getY()){
			return true;
		}
		
		return false;

	}
	
	
	
	

	
	public String toString(){
		return getX() + ", " + getY() + ", " + + getwidth() + ", " + + getheight() + ", " + getcolor() + ", " +  xSpeed + ", " + ySpeed;
	}
}