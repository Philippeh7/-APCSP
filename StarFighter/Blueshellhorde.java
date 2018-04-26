import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

public class Blueshellhorde
{
	private List<Blueshell> blueshells;
	private Image image; 

	public Blueshellhorde(int size)
	{
		int x = 50;
		int y = 50;
		blueshells = new ArrayList<Blueshell>();
		for(int i=0;i<size;i++){
			blueshells.add(new Blueshell(x,y,30,30,2));
				x += 50;
				if(x == 700){
					x = 300;
					y += 50;
				}
			
			
		}
		
			
			try
			{
				image = ImageIO.read(new File("C:\\Users\\hansenestruchp0969\\Desktop\\hansenestruchjava\\Unit 17\\src\\download.jpg"));
			
			}
			catch(Exception e)
			{
			}
	}

	public void add(Blueshell al)
	{
		blueshells.add(al);
	}
	
	public void drawEmAll( Graphics window )
	{
		for(int i = 0; i < blueshells.size();i++)
		{
			window.drawImage(image,blueshells.get(i).getX(),blueshells.get(i).getY(),blueshells.get(i).getWidth(),blueshells.get(i).getHeight(),null);
		}
	}

	public void moveEmAll()
	{
		for(int i = 0; i < blueshells.size();i++)
		{
			blueshells.get(i).setX(blueshells.get(i).getX() + blueshells.get(i).getSpeed()/2);
			blueshells.get(i).setY(blueshells.get(i).getY() + blueshells.get(i).getSpeed()/2);
			if(blueshells.get(i).getX()>740)
				blueshells.get(i).setSpeed(-blueshells.get(i).getSpeed());
			if(blueshells.get(i).getX()<0)
				blueshells.get(i).setSpeed(-blueshells.get(i).getSpeed());
			if(blueshells.get(i).getY()>520)
				blueshells.get(i).setSpeed(-blueshells.get(i).getSpeed());
			if(blueshells.get(i).getY()<0)
				blueshells.get(i).setSpeed(-blueshells.get(i).getSpeed());
		}	
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		for(int i = 0;i<shots.size();i++){
			for(int k = 0;k<blueshells.size();k++){
				if((shots.get(i).getX() <= blueshells.get(k).getX() + blueshells.get(k).getWidth() && shots.get(i).getX() >= blueshells.get(k).getX() - blueshells.get(k).getWidth()) && (shots.get(i).getY() <= blueshells.get(k).getY() + blueshells.get(k).getHeight() && shots.get(i).getY() >= blueshells.get(k).getY() - blueshells.get(k).getHeight()))
				{
					blueshells.get(k).setPos(5000, 5000);
					shots.get(i).setPos(6000, 6000);
				}
			}
		}
	}

	public List<Blueshell> returnlist(){
		return blueshells;
	}
	public String toString()
	{
		return "";
	}
}
