//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.lang.System;
import java.lang.Math;
import java.util.Scanner;

public class Grades
{
	//instance variables
	private double sum;
	private double[] grades;
	

	//constructor
	public Grades()
	{
		
	}
	
	public Grades(double summat, double[] gradelist)
	{
		setGrades(gradelist);
	}


	//set method
	public void setGrades(double[] gradelist)
	{
		grades= gradelist;
	}


	private double getSum()
	{
		double sum=0.0;
		for(int i=0;i<grades.length;i++)
		{
			sum += grades[i];
		}


		return sum;
	}

	public double getAverage()
	{
		double average=0.0;
		average = getSum()/grades.length;


		return average;
	}


	public String toString()
	{
		String output = "";
		for(int i=0;i<grades.length;i++)
		{
			output = output + "\n Grade " + i + " =" + grades[i];
		}
		output = output + "\n Average = " + getAverage();
		
		
		return output;
	}



}