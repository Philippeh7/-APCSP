//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class Triples
{
   private int number;
   private int A;
   private int B;
   private int C;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		number = num;

	}

	public void setNum(int num)
	{
        number = num;
        

	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int min = 0;
		min = Math.min(a, b);
		min = Math.min(min, c);

		for (int i = min; i>=1;i--)
		{
			if((a%i==0) && (b%i == 0) && (c%i ==0))
				return i;
			
		}
		return 2;
	}

	public String toString()
	{
		String output= "" ;
		for(int j = 1;j<(number+1);j++)
        {
        	for(int i=j;i<=(j*number);i++)
        	{
        		for(int k =1;k<(i*j);k++)
        		{
        			if((j*j + i*i) == (k*k))
        			{
        			if(j%2 != i%2 && k%2 == 1)
        			 {
        				if(greatestCommonFactor(j,i,k) == 1)
        				{
        					A = j;
        					B = i;
        					C = k;
        					output = output + "\n" + A +" "+ B + " "+ C + "\n";
        				}
        			 }
        			}
        		}
        	}
        }
		
		
		return output+"\n";
	}
}