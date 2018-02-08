//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;
	private double xpart;
	private double ypart;


	public Distance(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;

	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
		calcDistance();

	}

	public void calcDistance()
	{
		xpart = (xTwo - xOne)*(xTwo - xOne);
		ypart = (yTwo - yOne)*(yTwo - yOne);
		distance = Math.sqrt(xpart + ypart);

	}

	public void print( )
	{
		System.out.println("Distance==");
		System.out.printf("%.2f",distance);


	}
}