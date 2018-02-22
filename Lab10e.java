//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		int response;
		GuessingGame player = new GuessingGame();
		boolean cont = true;
		char responsechar = 'y';
		boolean correct = true;
		
	while(cont)
	{
		correct = true;
		out.println("Enter a bound for your guessing game");
		response = keyboard.nextInt();
		player.SetUpperBond(response);
		if(player.playGame())
			out.println(player);
		else
			out.println("you really suck at guessing don't you..., you lost");
	while(correct)
	{
		out.println("Do you want to continue? y or n");
		responsechar = keyboard.next().charAt(0);
		if (responsechar == 'y')
		{
			cont = true;
			correct = false;
		}
		else if (responsechar == 'n')
		{
			cont = false;
			correct = false;
		}
		else
		{
			out.println("That was not a correct response, try again");
		}
	}
	
	}


	out.println("Thanks for playing!");

	}
}