//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab21i
{
	public static void main( String args[] ) throws IOException
	{
		Scanner keyboard = new Scanner(new File("src/lab21i.dat"));
		while(keyboard.hasNext()) 
		{
			int i = keyboard.nextInt();
			String s = keyboard.nextLine();
			Maze tester = new Maze(i, keyboard.nextLine());
			System.out.print(tester);
		}
	}
}