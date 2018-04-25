//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Ship extends MovingThing
{
	private int speed;
	private Image image;

	public Ship()
	{
		this(10,10,10,10,10);
	}

	public Ship(int x, int y)
	{
	   this(x,y,5,5,1);
	}

	public Ship(int x, int y, int s)
	{
		this(x,y,5,5,s);
	}

	public Ship(int x, int y, int w, int h, int s)
	{
		super(x, y, w, h);
		speed=s;
		try
		{
			image = ImageIO.read(new File("C:\\Users\\hansenestruchp0969\\Desktop\\Unit10-2016\\ship.jpg"));
			//image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			System.out.println("Do something you idiot, there is an error");
		}
	}


	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void move(String direction)
	{
			 if(direction == "LEFT")
			setX(getX() - speed);
		else if(direction == "RIGHT")
			setX(getX() + speed);
		else if(direction == "UP")
			setY(getY() - speed);
		else if(direction == "DOWN")
			setY(getY() + speed);
	}

	public void draw( Graphics window )
	{
   	window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return super.toString() + " " + getSpeed();
	}
}
