//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;
	private Image image; 

	public AlienHorde(int size)
	{
		int x = 50;
		int y = 50;
		aliens = new ArrayList<Alien>();
		for(int i=0;i<size;i++){
				aliens.add(new Alien(x,y,30,30,2));
				x += 50;
				if(x == 700){
					x = 300;
					y += 50;
				}
			
			
		}
		
			
			try
			{
				image = ImageIO.read(new File("C:\\Users\\hansenestruchp0969\\Desktop\\Unit10-2016\\alien.jpg"));
			
			}
			catch(Exception e)
			{
			}
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}
	
	public void drawEmAll( Graphics window )
	{
		for(int i = 0; i < aliens.size();i++)
		{
			window.drawImage(image,aliens.get(i).getX(),aliens.get(i).getY(),aliens.get(i).getWidth(),aliens.get(i).getHeight(),null);
		}
	}

	public void moveEmAll()
	{
		for(int i = 0; i < aliens.size();i++)
		{
			aliens.get(i).setX(aliens.get(i).getX() + aliens.get(i).getSpeed());
			if(aliens.get(i).getX()>740)
				aliens.get(i).setSpeed(-aliens.get(i).getSpeed());
			if(aliens.get(i).getX()<0)
				aliens.get(i).setSpeed(-aliens.get(i).getSpeed());
		}	
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		for(int i = 0;i<shots.size();i++){
			for(int k = 0;k<aliens.size();k++){
				if((shots.get(i).getX() <= aliens.get(k).getX() + aliens.get(k).getWidth() && shots.get(i).getX() >= aliens.get(k).getX() - aliens.get(k).getWidth()) && (shots.get(i).getY() <= aliens.get(k).getY() + aliens.get(k).getHeight() && shots.get(i).getY() >= aliens.get(k).getY() - aliens.get(k).getHeight()))
				{
					aliens.get(k).setPos(5000, 5000);
					shots.get(i).setPos(6000, 6000);
				}
			}
		}
	}

	public String toString()
	{
		return "";
	}
}
