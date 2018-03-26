//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{
		

	}

	public TicTacToe(String game)
	{
		mat = new char[3][3];
		int counter = 0;
		for(int i = 0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				mat[i][j] = game.charAt(counter);
				counter++;
			}
		}



	}

	public String getWinner()
	{

		
		if(mat[0][0] == 'X' && mat[1][0] == 'X' && mat[2][0] == 'X')
		{
			return "X wins vertically!";
		}
		else if(mat[0][0] == 'X' && mat[0][1] == 'X' && mat[0][2] == 'X')
		{
			return "X wins horizontally!";
		}
		else if(mat[0][0] == 'X' && mat[1][1] == 'X' && mat[2][2] == 'X')
		{
			return "X wins diagonally!";
		}
		else if(mat[0][2] == 'X' && mat[1][1] == 'X' && mat[2][0] == 'X')
		{
			return "X wins diagonally!";
		}
		else if(mat[0][2] == 'X' && mat[1][2] == 'X' && mat[2][2] == 'X')
		{
			return "X wins vertically!";
		}
		else if(mat[0][1] == 'X' && mat[1][1] == 'X' && mat[2][1] == 'X')
		{
			return "X wins vertically!";
		}
		else if(mat[2][0] == 'X' && mat[2][1] == 'X' && mat[2][2] == 'X')
		{
			return "X wins horizontally!";
		}
		else if(mat[1][0] == 'X' && mat[1][1] == 'X' && mat[1][2] == 'X')
		{
			return "X wins horizontally!";
		}
		
		
		else if(mat[0][0] == 'O' && mat[1][0] == 'O' && mat[2][0] == 'O')
		{
			return "O wins vertically!";
		}
		else if(mat[0][0] == 'O' && mat[0][1] == 'O' && mat[0][2] == 'O')
		{
			return "O wins horizontally!";
		}
		else if(mat[0][0] == 'O' && mat[1][1] == 'O' && mat[2][2] == 'O')
		{
			return "O wins diagonally!";
		}
		else if(mat[0][2] == 'O' && mat[1][1] == 'O' && mat[2][0] == 'O')
		{
			return "O wins diagonally!";
		}
		else if(mat[0][2] == 'O' && mat[1][2] == 'O' && mat[2][2] == 'O')
		{
			return "O wins vertically!";
		}
		else if(mat[0][1] == 'O' && mat[1][1] == 'O' && mat[2][1] == 'O')
		{
			return "O wins vertically!";
		}
		else if(mat[2][0] == 'O' && mat[2][1] == 'O' && mat[2][2] == 'O')
		{
			return "O wins horizontally!";
		}
		else if(mat[1][0] == 'O' && mat[1][1] == 'O' && mat[1][2] == 'O')
		{
			return "O wins horizontally!";
		}
		








		return "it's a cats game!";
	}

	public String toString()
	{
		String output="";
		for(int i = 0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				output += mat[i][j];
		}
			output += "\n";
		}
	output += " \n" + getWinner();



		return output+"\n\n";
	}
}