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

public class GradeBookFileRunner
{
   public static void main( String args[] ) throws Exception
   {
	   
		out.println("Welcome to the Class Stats program!");
		
		Scanner file = new Scanner(new File("C:\\Users\\hansenestruchp0969\\Desktop\\hansenestruchjava\\Unit 11\\src\\APStatsData.dat"));
		String classname = file.nextLine();
		int stunum = file.nextInt();
		Class APStats = new Class(classname, stunum);
		for(int i=0;i<stunum;i++)
		{
			String one = file.nextLine();
			String two = file.nextLine();
			Student newstudent = new Student(one,two);
			APStats.addStudent(i, newstudent);
		}
		out.println(APStats);












	}		
}