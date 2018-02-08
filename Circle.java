import java.util.Scanner;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Circle
{
	private double radius;
	
	public void setRadius(double rad)
	{
		radius = rad;
	}

	public double calculateArea( )
	{
		return radius * radius * 3.14159;
	}

	public void print( )
	{
		System.out.println("Area of the Circle:");
		System.out.printf("%.2f",calculateArea());
	}
}