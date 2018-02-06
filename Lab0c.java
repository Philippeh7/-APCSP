//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Lab0c
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		//declaring variables
		int intOne, intTwo;
		double doubleOne, doubleTwo;
		float floatOne, floatTwo;
		short shortOne, shortTwo;
		int intTotal = 0;
		double doubleTotal = 0.0;
		byte byter;
		long longboi;
		long longboi2;
		long totalongboi;
		short shortTotal;
		
		
		//input for variables
		System.out.print("Enter an integer :: ");
		intOne = keyboard.nextInt();


		System.out.print("Enter an integer :: ");
		intTwo = keyboard.nextInt();
		
		System.out.print("Enter a byte :: ");
		byter = keyboard.nextByte();
		
		System.out.print("Enter a long :: ");
		longboi = keyboard.nextLong();
		
		System.out.print("Enter a long :: ");
		longboi2 = keyboard.nextLong();

		totalongboi = longboi + longboi2;
		
		System.out.print("Enter a double :: ");
		doubleOne = keyboard.nextDouble();
		
		System.out.print("Enter a double :: ");
		doubleTwo = keyboard.nextDouble();
		
		System.out.print("Enter a short :: ");
		shortOne = keyboard.nextShort();
		
		System.out.print("Enter a short :: ");
		shortTwo = keyboard.nextShort();
		

		//calculations for bonus
		intTotal = intOne + intTwo;
		doubleTotal = doubleOne + doubleTwo;
		shortTotal = (short) (shortOne + shortTwo);


		//print out the variabletypes
		System.out.println();
		System.out.println("integer one = " + intOne );
		System.out.println("integer two = " + intTwo );
		System.out.println("byte = " + byter );
		System.out.println("long = " + longboi );
		System.out.println("double one = " + doubleOne );
		System.out.println("double two = " + doubleTwo );
		System.out.println("short one = " + shortOne );
		System.out.println("short two = " + shortTwo );
		System.out.println("Sum of Ints = " + intTotal );
		System.out.println("Sum of Doubles = " + doubleTotal );
		System.out.println("Sum of Shorts = " + shortTotal );
		System.out.println("Sum of Longs = " + totalongboi );
		

		//add in output for all variables








	}
}