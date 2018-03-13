//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.File;
import java.util.ArrayList;
public class GradeBookFileRunner
{
   public static void main( String args[] ) throws Exception
   {
	   	ArrayList<Class> classes = new ArrayList<Class>();
		out.println("Welcome to the Class Stats program!");
		Scanner file = new Scanner(new File("C:\\Users\\hansenestruchp0969\\Desktop\\hansenestruchjava\\Unit 11\\src\\APStatsData.dat"));
		String classname = file.nextLine();
		int stunum = file.nextInt();
		Class newclass = new Class(classname, stunum);
		System.out.println(file.nextLine());
		for(int i=0;i<stunum;i++){
			Student newstudent = new Student(file.nextLine(),file.nextLine());
			newclass.addStudent(i, newstudent);}
		newclass.organizeclass();
		classes.add(newclass);
		out.println(newclass);
		out.println("Failure List = " + newclass.getFailureList(70));	
		out.println("Highest Average = " + newclass.getStudentWithHighestAverage());
		out.println("Lowest Average = " + newclass.getStudentWithLowestAverage());	
		out.println(String.format("Class Average = %.2f",newclass.getClassAverage()));	












	}		
}