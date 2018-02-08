//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public Quadratic()
	{
		a = 0;
		b = 0;
		c = 0;

	}

	public Quadratic(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;

	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;


 	}

	public void calcRoots( )
	{
		double top1 = ((Math.sqrt((b*b)-(4*a*c))) - b);
		
		double top2 = (-b - (Math.sqrt((b*b)-(4*a*c))));
		
		rootOne = top1/(2 * a);
		
		rootTwo = top2/(2 * a);
		

	}

	public void print( )
	{
		System.out.println("RootOne:");
		System.out.printf("%.2f\n",rootOne);
		System.out.println("RootTwo:");
		System.out.printf("%.2f\n",rootTwo);
	}
}