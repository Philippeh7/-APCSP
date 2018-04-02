//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		xPos = 0;
		yPos = 0;
		width = 0;
		height = 0;
		color = Color.RED;

	}
	
	public Block(int x, int y)
	{
		xPos = x;
		yPos = y;
		width = 0;
		height = 0;
		color = Color.RED;

	}
	
	public Block(int x, int y, int w, int h)
	{
		xPos = x;
		yPos = y;
		width = w;
		height = h;
		color = Color.RED;

	}
	
	public Block(int x, int y, int w, int h, Color col)
	{
		xPos = x;
		yPos = y;
		width = w;
		height = h;
		color = col;

	}
	//add other Block constructors - x , y , width, height, color
	public void setPos(int x, int y){
		xPos = x;
		yPos = y;
	}
	public void setX(int x){
		xPos = x;
	}
	public void setY(int y){
		yPos = y;
	}
	public void setwidth(int w){
		width = w;
	}
	public void setheight(int h){
		height = h;
	}
	
	
	
	
	
	
	
	
	
	
   //add the other set methods
   

   public void setColor(Color col)
   {
	   color = col;
   }

   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getwidth(), getheight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getwidth(), getheight());

   }
   
	public boolean equals(Block obj)
	{
		if(obj.getX() == xPos && obj.getY() == yPos && obj.getheight() == height && obj.getwidth() == width && obj.getcolor() == color)
			return true;
		

		
		return false;
	}   

   //add the other get methods
	
	public int getX(){
		return xPos;
	}
	public int getY(){
		return yPos;
	}
	public int getwidth(){
		return width;
	}
	public int getheight(){
		return height;
	}
	public Color getcolor(){
		return color;
	}
	
    

   //add a toString() method  - x , y , width, height, color
	public String toString(){
		return getX() + ", " + getY() + ", " + + getwidth() + ", " + + getheight() + ", " + color;
	}
}