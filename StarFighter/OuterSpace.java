//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	//private Alien alienOne;
	//private Alien alienTwo;
	//private Ammo testbullet; 

	/**
	 * Instantiates all the proper variables needed as well as constructs variables
	 **/
	
	private AlienHorde horde;
	private Bullets shots;
	private Blueshellhorde blueshells;
	private Bullets othershots;
	private int counter;
	private int counter2;

	private boolean[] keys;
	private BufferedImage back;

	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];
		counter = 0;
		counter2 = 0;
		//instantiate other instance variables
		//Ship, Alien
		ship = new Ship(370,450,50,50,2);
		//alienOne = new Alien(300,50,30,30,2);
		//alienTwo = new Alien(440,50,30,30,2);
		horde = new AlienHorde(40);
		blueshells = new Blueshellhorde(6);
		shots = new Bullets();
		othershots = new Bullets();
		

		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);

		if(keys[0] == true)
		{
			ship.move("LEFT");
		}
		if(keys[1] == true)
		{
			ship.move("RIGHT");
		}
		if(keys[2] == true)
		{
			ship.move("UP");
		}
		if(keys[3] == true)
		{
			ship.move("DOWN");
		}
		if(keys[4] == true && counter2 == 50)
		{
			shots.add(new Ammo(ship.getX() + 20,ship.getY() + 20,ship.getSpeed()));
			counter2 = 0;
		}
		if (counter == 300){
			for(int i = 0;i<blueshells.returnlist().size();i++){
				othershots.add(new Ammo(blueshells.returnlist().get(i).getX(),blueshells.returnlist().get(i).getY(), -Math.abs(blueshells.returnlist().get(i).getSpeed())));
				counter = 0;
			}
		}
		if(counter2 < 50)
			counter2++;
		/**
		 * Runs all the codes from the various classes to draw, move, and check for hits.
		 **/
		counter++;
		shots.drawEmAll(graphToBack);
		shots.moveEmAll();
		ship.draw(graphToBack);
		horde.drawEmAll(graphToBack);
		othershots.drawEmAll(graphToBack);
		othershots.moveEmAll();
		blueshells.drawEmAll(graphToBack);
		blueshells.removeDeadOnes(shots.getList());
		blueshells.moveEmAll();
		horde.moveEmAll();
		horde.removeDeadOnes(shots.getList());
		shots.cleanEmUp(horde.getList());
		//add code to move Ship, Alien, etc.
		if(ship.getX() < 0)
			ship.setX(0);
		if(ship.getX() > 740)
			ship.setX(740);
		if(ship.getY() < 0)
			ship.setY(0);
		if(ship.getY() > 520)
			ship.setY(520);


		//add in collision detection to see if Bullets hit the Aliens and if Bullets hit the Ship
		
		ship.hit(othershots.getList());
		twoDGraph.drawImage(back, null, 0, 0);
		
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{
      //no code needed here
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}

