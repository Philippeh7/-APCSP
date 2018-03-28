//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSort
{
	

	private static int getNumDigits(int number)
	{
		int count = 0;
		int tempcount = number;
		while(tempcount > 0) {
			tempcount = tempcount/10;
			count++;
		}
		
		return count;
	}
	
	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = new int[getNumDigits(number)];
		
		for(int i=0;i<sorted.length;i++) {
			sorted[i] = number%10;
			number = number/10;
		}
		
		//bubble sort
		for(int i =0;i<sorted.length;i++) {
			for(int k =0;k<sorted.length;k++) {
				if(sorted[i] < sorted[k]) {
					int temp = sorted[k];
					sorted[k] = sorted[i];
					sorted[i] = temp;
				}
			}
		}
		
		

		return sorted;
	}
}