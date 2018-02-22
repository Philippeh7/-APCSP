//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;
	private int random;
	private int count;
	
	public GuessingGame()
	{
		upperBound = 0;

	}

	public GuessingGame(int stop)
	{
		upperBound = stop;

	}
	public void SetUpperBond(int stop)
	{
		upperBound = stop;
		random = (int) ((Math.random() *upperBound) + 1);
		count = 0;
	}

	public boolean playGame()
	{
		Scanner keyboard = new Scanner(System.in);
		int enter;
		do
		{
			out.println("Enter a number between 1 and " + upperBound);
			enter = keyboard.nextInt();
			count++;
			if(check(enter))
			{
				return true;
			}
			else
			{
				out.print("That isn't correct, try again\n");
			}
			
		} while(count < upperBound);
		return false;
		


	}
	public boolean check(int n)
	{
		if (n == random)
			return true;
		else
			return false;
	}
	
	public double percentwrong(int n)
	{
		double percentage = 1-(1/n);
		return percentage;
	}

	public String toString()
	{
		String output="Congrats you guessed correctly! The number was " + random + " that took you " + count + " tries " + " you were wrong " + percentwrong(count) + " percent of the time";
		return output;
	}
}