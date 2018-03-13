//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

import java.util.ArrayList;

public class GradeBookRunner
{
   public static void main( String args[])
   {
		out.println("Welcome to the Class Stats program!");
		ArrayList<Class> classes = new ArrayList<Class>();
		Scanner keyboard = new Scanner(System.in);
		out.println("How many classes would you like to enter into this gradebook?");
		int classnum = keyboard.nextInt();
	for(int j=0;j<classnum;j++)
	{
		out.println("What is the name of class " + j + " ?\n");
		String classname = keyboard.next();
		out.println("\nHow many people are in the class " + j + " ?");
		int classize = keyboard.nextInt();
		Class classgrades = new Class(classname, classize);
		for(int i=0;i<classize;i++)
		{
			out.println("What is the name of student "+ i + " ?");
			String name = keyboard.next();
		
			out.println("What is this students grades? \n Format: Number of grades - grade1 grade2 grade3 ... \n Ex: 3 - 56.2 56.2 45.3");
			String grades = keyboard.nextLine();
			System.out.println(grades);
			Student newstudent = new Student(classname, grades);
			classgrades.addStudent(i, newstudent);
		}
		classes.add(classgrades);
		
	}
		
		
		
		
		















	}		
}