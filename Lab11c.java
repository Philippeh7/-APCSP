//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class Lab11c
{
   public static void main( String args[] )
   {
	   Scanner keyboard = new Scanner(System.in);
		int response;
		TriangleThree player = new TriangleThree();
		boolean cont = true;
		char responsechar = 'y';
		char responsechar2 = 'y';
		boolean correct = true;
		
	while(cont)
	{
		correct = true;
		out.println("Enter a size for your triangle");
		response = keyboard.nextInt();
		out.println("Enter a character to make up this triangle");
		responsechar2 = keyboard.next().charAt(0);
		player.setTriangle(response, responsechar2);
		out.println(player);
		
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