//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Lab08g
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		boolean selecting = true;
		int beg = 0;
		int end = 0;
	while(selecting)
	{
		out.print("Enter the beginning of the list:   ");
	    beg = keyboard.nextInt();
		out.print("\nEnter the end of the list:   ");
		end = keyboard.nextInt();
		if (beg > end)
		{
			out.print("Sorry this list isn't correct, enter a beginning and an end where the beginning is less than the end\n\n");
		}
		else
			selecting = false;
	}
		LoopStats tester = new LoopStats(beg,end);
		out.print(tester);
		
		
		
		
		
					
	}
}