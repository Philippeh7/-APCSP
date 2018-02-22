//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class Lab11j
{
   public static void main(String args[])
   {
	   Scanner keyboard = new Scanner(System.in);
		int response;
		Triples player = new Triples();
		boolean cont = true;
		char responsechar = 'y';
		boolean correct = true;
		
	while(cont)
	{
		correct = true;
		out.println("Enter max num you want to search for triples");
		response = keyboard.nextInt();
		player.setNum(response);
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