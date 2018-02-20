//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class Lab09f
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		boolean selecting = true;
		String set;
		char remove;
		int select;
		LetterRemover tester = new LetterRemover();
	while(selecting)
	{
		out.print("Enter a string:   ");
	    set = keyboard.nextLine();
		out.print("\nEnter the character you want to remove:   ");
		remove = keyboard.nextLine().charAt(0);
		tester.setRemover(set, remove);
		out.print(tester);
		out.print("\nDo you want to enter another sentence?  1 = yes, 2 = no:   ");
		select = keyboard.nextInt();
		if (select == 2)
		{
			selecting = false;
		}
		
	}
		
		
		
											
	}
}