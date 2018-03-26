//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze 
{
   private int[][] maze;

	public Maze()
	{


	}

	public Maze(int size, String line)
	{
		maze = new int[size][size];
		Scanner chopper = new Scanner(line);
	for(int k=0;k<size;k++)
	{
		for(int i=0;i<size;i++ )
		{
		
			maze[k][i] = chopper.nextInt();
			
		}
	}

	}

	public boolean hasExitPath(int r, int c)
	{
		
	  if(c == (maze.length-1) && maze[r][c] == 1)
			return true;
	  
	  if(maze[r][c] == 1)
	  {
		  maze[r][c] = 0;
		if(r<(maze.length-1) && maze[r+1][c] == 1 && hasExitPath(r+1,c))
			    return true;
		if(r>0 && maze[r-1][c] == 1 && hasExitPath(r-1,c))
				return true;
		if(c<(maze.length-1) && maze[r][c+1] == 1 && hasExitPath(r,c+1))
				return true;
		if(c>0 && maze[r][c-1] == 1 && hasExitPath(r,c-1))
				return true;
	  }
		

		return false;
	}

	public String toString()
	{
		String output="\n";
		for(int k=0;k<maze.length;k++)
		{
			for(int i=0;i<maze.length;i++ )
			{
			
				output += maze[k][i] + " ";
				
			}
			output += "\n";
		}

		if(hasExitPath(0,0))
			output += "\n" + "Has an Exit \n" ;
		else
			output += "\n" + "Does not have an Exit \n";


		return output;
	}
}