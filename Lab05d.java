//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Lab05d
{
	public static void main ( String[] args )
	{
		boolean cont = true;
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter a letter :: ");
		char letter = keyboard.next().charAt(0);
		CharacterAnalyzer test = new CharacterAnalyzer(letter);
		out.println(test);   //A

	while (cont)
	{
		out.print("Enter a letter :: ");
		letter = keyboard.next().charAt(0);
		test.setChar(letter);
		out.println(test);
		out.print("Do you want to continue? (true or false):: ");
		cont = keyboard.nextBoolean();
	}
		
		
		
		
		
		
		
		
		
		
		

	}
}