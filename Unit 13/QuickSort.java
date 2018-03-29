//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import static java.lang.System.*;
import java.util.Arrays;		//use Arrays.toString() to help print out the array

public class QuickSort
{
	private static int passCount = -1;

	public static void quickSort(int[] array)
	{
		quickSort(array, 0, array.length - 1);
	}


	private static void quickSort(int[] array, int low, int high)
	{
		if (low < high)
        {
           
            int pi = partition(array, low, high);
 
            
            quickSort(array, low, pi-1);
            quickSort(array, pi+1, high);
            
        }
		passCount = 0;
		
	}
	private static int partition(int[] array, int low, int high)
	{
		passCount++;
		int pivot = array[high]; 
		
        int i = (low-1); 
        
        for (int j=low; j<high; j++)
        {
           
            if (array[j] <= pivot)
            {
                i++;
 
               
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
 
        
        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;
        
        System.out.print("Case " + passCount + ":    ");
        for(int k =0;k<array.length;k++)
        {
        	System.out.print(array[k] + " ");
        }
        System.out.println("\n");
        
        return i+1;
        

	}
}