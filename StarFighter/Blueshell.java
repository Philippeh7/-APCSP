import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Blueshell extends MovingThing
{
	private int speed;
	private Image image;

	/**
	 * Works like the Alien class but with a blue shell image
	 **/
	public Blueshell()
	{
		this(0,0,30,30,0);
	}

	public Blueshell(int x, int y)
	{
		this(x,y,30,30,0);
	}

	public Blueshell(int x, int y, int s)
	{
		this(x,y,30,30,s);
	}

	public Blueshell(int x, int y, int w, int h, int s)
	{
		super(x, y, w,h);
		speed=s;
		try
		{
			image = ImageIO.read(new File("C:\\Users\\hansenestruchp0969\\Desktop\\StarFighter\\download.jpg"));
			//image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			//feel free to do something here
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
		return "";
	}
}
