import static java.lang.System.out;

import java.util.Scanner;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab14d
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		int response;
		Grades player = new Grades();
		boolean cont = true;
		char responsechar = 'y';
		boolean correct = true;
	
		
	while(cont)
	{
		correct = true;
		out.println("How many grades do you have to enter?");
		response = keyboard.nextInt();
		double[] grades = new double[response];
		for(int i=0;i<response;i++)
		{
			out.println("Grade " + i);
			grades[i] = keyboard.nextDouble();
		}
		player.setGrades(grades);
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


	}
		
		
		
	}
