//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class AtCounter
{
   private char[][] atMat;
   private int atCount;

	public AtCounter()
	{
		atCount=0;
			   atMat = new char[][]{{'@','-','@','-','-','@','-','@','@','@'},
									{'@','@','@','-','@','@','-','@','-','@'},
									{'-','-','-','-','-','-','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','-','@'},
									{'-','@','-','@','-','@','-','@','-','@'},
									{'@','@','@','@','@','@','-','@','@','@'},
									{'-','@','-','@','-','@','-','-','-','@'},
									{'-','@','@','@','-','@','-','-','-','-'},
									{'-','@','-','@','-','@','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','@','@'}};
	}

	public int countAts(int r, int c)
	{
		int count = 0;
		if(atMat[r][c] == '@')
		{
			count++;
			atMat[r][c] = 'B';
			if(r>0)
			{
				countAts(r-1,c);
			}
			if(r<atMat.length-1)
			{
				countAts(r+1,c);
			}
			if(c>0)
			{
				countAts(r,c-1);
			}
			if(c<atMat[r].length-1)
			{
				countAts(r,c-1);
			}
			
		}
		//add in recursive code to count up the # of @s connected
		//start checking at spot [r,c]
		
		atCount += count;
		return count;
	}

	public int getAtCount()
	{
		return atCount;
	}

	public String toString()
	{
		String output="";
		output+=getAtCount()+" @s connected.";
		return output;
	}
}