//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.lang.Math;
import java.util.Scanner;

public class Lab08i
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		boolean selecting = true;
		int num =0;
		Prime tester = new Prime();
	while(selecting)
	{
		out.print("Enter a number to test if it's prime:   ");
	    num = keyboard.nextInt();
		tester.setPrime(num);
		out.print(tester);
		out.print("\nDo you want to enter another number?  1 = yes, 2 = no:   ");
		num = keyboard.nextInt();
		if (num == 2)
		{
			selecting = false;
		}
		
	}
		
		
		
		
		
		
		
	}	
}