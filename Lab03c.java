//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03c
{
	public static void main( String[] args )
   {
	Scanner keyboard = new Scanner(System.in);
   	Quadratic quad1 = new Quadratic();
   	
    System.out.println("Enter A:");
   	int quadA = keyboard.nextInt();
   	System.out.println("\nEnter B:");
	int quadB = keyboard.nextInt();
	System.out.println("\nEnter C:");
	int quadC = keyboard.nextInt();
   	quad1.setEquation(quadA, quadB, quadC);
   	quad1.calcRoots();
   	quad1.print();
    System.out.println("Enter A:");
   	quadA = keyboard.nextInt();
   	System.out.println("\nEnter B:");
    quadB = keyboard.nextInt();
	System.out.println("\nEnter C:");
	quadC = keyboard.nextInt();
   	quad1.setEquation(quadA, quadB, quadC);
   	quad1.calcRoots();
   	quad1.print();
    System.out.println("Enter A:");
    quadA = keyboard.nextInt();
   	System.out.println("\nEnter B:");
    quadB = keyboard.nextInt();
	System.out.println("\nEnter C:");
    quadC = keyboard.nextInt();
   	quad1.setEquation(quadA, quadB, quadC);
   	quad1.calcRoots();
   	quad1.print();
   	
		
		
	}
}