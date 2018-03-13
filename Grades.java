//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Grades
{
	private ArrayList<Double> grades;
	
	
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
		grades = new ArrayList<Double>();
		System.out.println(gradeList);
		gradeList = gradeList.substring(4);
		Scanner chopper = new Scanner(gradeList);
		while(chopper.hasNext())
		{
			setGrade(chopper.nextDouble());
		}
	}
	
	public void setGrade( double grade)
	{
		grades.add(grade);
	}
	
	public double getSum()
	{
		double sum=0.0;
		for(int i=0;i<grades.size();i++)
		{
			sum = sum + grades.get(i);
		}



		return sum;
	}
	
	public double getLowGrade()
	{
		double low = Double.MAX_VALUE;
		for(int i=0;i<grades.size();i++)
		{
			if(i==0)
				low = grades.get(i);
			else if(grades.get(i) < low)
				low = grades.get(i);
			
		}




		return low;
	}
	
	public double getHighGrade()
	{
		double high = Double.MIN_VALUE;
		for(int i=0;i<grades.size();i++)
		{
			if(i==0)
				high = grades.get(i);
			else if(grades.get(i) > high)
				high = grades.get(i);
			
		}




		return high;
	}
	
	public int getNumGrades()
	{
		return grades.size();
	}
	
	public ArrayList<Double> getGrades()
	{
		return grades;
	}
	
	public String toString()
	{
		String output= grades + "\nsum = " + getSum() + "\nGrades Length = " + getNumGrades() + "\nLow Grade = " + getLowGrade() + "\nHigh Grade = " + getHighGrade();
		
		return output;
	}	
}