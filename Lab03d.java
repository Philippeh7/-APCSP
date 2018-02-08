//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03d
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
	   	Distance quad1 = new Distance(2,3,4,5);
	   	
	   	System.out.println("Enter the X1 :");
	   	 int quadA = keyboard.nextInt();
	   	System.out.println("\nEnter the Y1  point:");
		 int quadB = keyboard.nextInt();
		System.out.println("\nEnter the X2 Point:");
		int quadC = keyboard.nextInt();
		System.out.println("\nEnter the Y2 Point:");
		 int quadD = keyboard.nextInt();
	   	quad1.setCoordinates(quadA, quadB, quadC, quadD);
	   	quad1.print();
	   	System.out.println("Enter the X1 point:");
	   	 quadA = keyboard.nextInt();
	   	System.out.println("\nEnter the Y1 point:");
		 quadB = keyboard.nextInt();
		System.out.println("\nEnter the X2 Point:");
		 quadC = keyboard.nextInt();
		System.out.println("\nEnter the Y2 Point:");
		 quadD = keyboard.nextInt();
	   	quad1.setCoordinates(quadA, quadB, quadC, quadD);
	   	quad1.print();
	   	System.out.println("Enter the X1 point:");
	   	 quadA = keyboard.nextInt();
	   	System.out.println("\nEnter the Y1 point:");
		 quadB = keyboard.nextInt();
		System.out.println("\nEnter the X2 Point:");
		 quadC = keyboard.nextInt();
		System.out.println("\nEnter the Y2 Point:");
		 quadD = keyboard.nextInt();
	   	quad1.setCoordinates(quadA, quadB, quadC, quadD);
	   	quad1.print();
		
		
		
		
			
	}
}