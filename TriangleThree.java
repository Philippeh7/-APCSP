//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private char letter;

	public TriangleThree()
	{
		size = 1;
		letter = 'A';
	}

	public TriangleThree(int count, char let)
	{
		size = count;
		letter = let;
	}

	public void setTriangle( int sz, char let )
	{
		size = sz;
		letter = let;
	}

	public char getLetter()
	{
		return letter;
	}

	public String toString()
	{
		String output="";
		for (int i = 0;i<=size;i++)
		{
		   for (int j = size; j>=i; j--)
		   {
		       output = output + " ";
		   }   

		   for (int k = 0; k<= i; k++)
		   {   
		       output = output + letter;
		   }   

		   output = output + "\n";
		}

			

		return output+"\n";
	}
}