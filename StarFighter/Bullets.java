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

public class Bullets
{
	private List<Ammo> ammo;

	public Bullets()
	{
		ammo = new ArrayList<Ammo>();
	}

	public void add(Ammo al)
	{
		ammo.add(al);
	}

	//post - draw each Ammo
	public void drawEmAll( Graphics window )
	{
		window.setColor(Color.yellow);
		for(int i=0;i<ammo.size();i++){
			window.fillRect(ammo.get(i).getX(), ammo.get(i).getY(), ammo.get(i).getWidth(), ammo.get(i).getHeight());
		}
	}

	public void moveEmAll()
	{
		for(int i=0;i<ammo.size();i++){
			ammo.get(i).move("UP");
		}
	}

	public void cleanEmUp(List<Alien> aliens)
	{
		for(int i = 0;i<ammo.size();i++){
			for(int k = 0;k<aliens.size();k++){
				if((ammo.get(i).getX() <= aliens.get(k).getX() + aliens.get(k).getWidth() && ammo.get(i).getX() >= aliens.get(k).getX() - aliens.get(k).getWidth()) && (ammo.get(i).getY() <= aliens.get(k).getY() + aliens.get(k).getHeight() && ammo.get(i).getY() >= aliens.get(k).getY() - aliens.get(k).getHeight()))
				{
					aliens.get(k).setPos(5000, 5000);
					ammo.get(i).setPos(6000, 6000);
				}
			}
		}
	}

	public List<Ammo> getList()
	{
		return ammo;
	}

	public String toString()
	{
		return "";
	}
}
