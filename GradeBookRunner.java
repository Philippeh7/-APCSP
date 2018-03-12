//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class GradeBookRunner
{
   public static void main( String args[] )
   {
		out.println("Welcome to the Class Stats program!");
		
		Scanner keyboard = new Scanner(System.in);
		
		out.println("What is the name of the class?");
		String classname = keyboard.nextLine();
		out.println("How many people are in the class?");
		int classize = keyboard.nextInt();
		Class APStats = new Class(classname, classize);
		for(int i=0;i<classize;i++)
		{
			out.println("What is the name of student "+ i + " ?");
			String name = keyboard.nextLine();
		if(keyboard.hasNextLine()){
			out.println("What is this students grades? \n Format: Number of grades - grade1 grade2 grade3 ... \n Ex: 3 - 56.2 56.2 45.3");
			String grades = keyboard.nextLine();
			Student newstudent = new Student(classname, grades);
			APStats.addStudent(i, newstudent);
		}
		}
		out.println(APStats);
		
		
		
		















	}		
}