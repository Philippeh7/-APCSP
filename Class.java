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

public class Class
{
	private String name;
	private ArrayList<Student> studentList;
	
	public Class()
	{
		name="";
		studentList=new ArrayList<Student>();
	}
	
	public Class(String nameclass, int stuCount)
	{
		name = nameclass;
		studentList=new ArrayList<Student>();
	
	}
	
	public void addStudent(int stuNum, Student s)
	{
		studentList.add(s);

	}
	
	public String getClassName()
	{
	   return name;	
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;
		for(int i=0;i<studentList.size();i++)
		{
			classAverage += studentList.get(i).getAverage();
		}
		
		
		return classAverage/studentList.size();
	}
	
	public double getStudentAverage(int stuNum)
	{
		return studentList.get(stuNum).getAverage();
	}

	public double getStudentAverage(String stuName)
	{
		for(int i=0;i<studentList.size();i++)
		{
			if(studentList.get(i).getName() == stuName)
			{
				return studentList.get(i).getAverage();
			}
		}


		return 0.0;
	}
	
	public String getStudentName(int stuNum)
	{
		return studentList.get(stuNum).getName();
	}

	public String getStudentWithHighestAverage()
	{
		double high = Double.MIN_VALUE;
		String hName ="";
		for(int i=0;i<studentList.size();i++)
		{
			if(i ==0)
			{
				high = getStudentAverage(i);
				hName = getStudentName(i);
			}
			else if(getStudentAverage(i) > high)
			{
				high = getStudentAverage(i);
				hName = getStudentName(i);	
			}
		}
		return hName;
	}

	public String getStudentWithLowestAverage()
	{
		double low = Double.MAX_VALUE;
		String hName ="";		
		for(int i=0;i<studentList.size();i++)
		{
			if(i ==0)
			{
				low = getStudentAverage(i);
				hName = getStudentName(i);
			}
			else if(getStudentAverage(i) < low)
			{
				low = getStudentAverage(i);
				hName = getStudentName(i);	
			}
		}

		return hName;
	}
	
	public String getFailureList(double failingGrade)
	{
		String output = "";
		for(int i=0;i<studentList.size();i++)
		{
			if(getStudentAverage(i) <= 60)
			{
			 output += " " + getStudentName(i);
			}
		}
	

		return output;
	}
	
	public void organizeclass()
	{
		for(int i=0;i<studentList.size();i++)
		{
			for(int j=0;j<studentList.size();j++)
			{
				if(studentList.get(i).compareTo(studentList.get(j)) == -1)
				{
					Student temp = studentList.get(i);
					studentList.set(i, studentList.get(j));
					studentList.set(j, temp);
				}
			}
		}
	}
	public String toString()
	{
		String output=""+getClassName()+"\n";
		



		return output;
	}  	
}