//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab24d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("C:\\Users\\hansenestruchp0969\\Desktop\\hansenestruchjava\\Unit 14\\src\\lab24d.dat"));
		int loop = file.nextInt();
		for(int i=0;i<loop;i++)
		{
			TicTacToe newtictac = new TicTacToe(file.next());
			System.out.println(newtictac);
		}






	}
}



