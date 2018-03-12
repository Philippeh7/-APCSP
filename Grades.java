//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Grades
{
	private double[] grades;
	
	
	public Grades()
	{
		setGrades("");
	}
	
	public Grades(String gradeList)
	{
		setGrades(gradeList);		
	}
	
	public void setGrades(String gradeList)
	{
		String temp;
		temp = "" + gradeList.charAt(0);
		grades = new double[Integer.parseInt(temp)];
		gradeList = gradeList.substring(4);
		Scanner chopper = new Scanner(gradeList);
		int counter = 0;
		while(chopper.hasNext())
		{
			setGrade(counter,chopper.nextDouble());
			counter++;
		}
	}
	
	public void setGrade(int spot, double grade)
	{
		grades[spot] = grade;
	}
	
	public double getSum()
	{
		double sum=0.0;
		for(int i=0;i<grades.length;i++)
		{
			sum = sum + grades[i];
		}



		return sum;
	}
	
	public double getLowGrade()
	{
		double low = Double.MAX_VALUE;
		for(int i=0;i<grades.length;i++)
		{
			if(i==0)
				low = grades[i];
			else if(grades[i] < low)
				low = grades[i];
			
		}




		return low;
	}
	
	public double getHighGrade()
	{
		double high = Double.MIN_VALUE;
		for(int i=0;i<grades.length;i++)
		{
			if(i==0)
				high = grades[i];
			else if(grades[i] > high)
				high = grades[i];
			
		}




		return high;
	}
	
	public int getNumGrades()
	{
		return grades.length;
	}
	
	public double[] getGrades()
	{
		return grades;
	}
	
	public String toString()
	{
		String output= grades + "\nsum = " + getSum() + "\nGrades Length = " + getNumGrades() + "\nLow Grade = " + getLowGrade() + "\nHigh Grade = " + getHighGrade();
		




		return output;
	}	
}