//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.lang.Math;

public class Prime
{
	private int number;

	public Prime()
	{
		number = 5;

	}

	public Prime(int num)
	{
		number = num;
		
	}

	public void setPrime(int num)
	{
		number = num;

	}

	public boolean isPrime()
	{
		if (number == 0 || number == 1)
			return false;
		for(int i = 1;i<(number + 1);i++)
		{
			if (number % i == 0 && i != 1 && i!= number)
				return false;
		}
		return true;
	}

	public String toString()
	{
		String output;
	if (isPrime())
		 output="The number: " + number + "  is prime";
	else
	     output="The number: " + number + "  is not prime";







		return output;
	}
}