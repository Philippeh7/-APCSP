import java.util.Scanner;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab0b
{
	public static void main ( String[] args )
	{
		//define 1 variable of each of the
		//following data types
		//byte		short		int 		long
		//float		double
		//char      boolean		String

		//integer variables
		
		Scanner keyboard = new Scanner(System.in);
		
		byte byteOne = 127;
		
		System.out.print("Enter a byte :: ");
		byteOne = keyboard.nextByte();
		
		short shorty = 2567;
		
		System.out.print("Enter a short :: ");
		shorty = keyboard.nextShort();
		
		
		int num = 43;
		
		System.out.print("Enter an integer :: ");
		num = keyboard.nextInt();
		
		
		
		

		//decimal variables
		float floaty = 32.54f;
		
		System.out.print("Enter a float :: ");
		floaty = keyboard.nextFloat();
		
		double doubly = 43.221;

		System.out.print("Enter a double :: ");
		doubly = keyboard.nextDouble();
		
		//other integer types
		long longboi= 45573;

		//System.out.print("Enter a long :: ");
		//longboi = keyboard.nextLong();
		//other types
		char letter = 'a';
		System.out.print("Enter a char:: ");
		String latter = new String("");
		latter = keyboard.next();
		letter = latter.charAt(0);
		
		boolean whatup = true;
		System.out.print("Enter a bool:: ");
		whatup = keyboard.nextBoolean();
		
		
		
		
		String whatsup = new String("My friends are nice");
		System.out.print("Enter a String:: ");
		whatsup = keyboard.nextLine();
		
		
		
		
		//output your information here
		
		
		
		
		
		System.out.println("/////////////////////////////////");
		System.out.println("*Philippe                2/1/18*");
		System.out.println("*                               *");
		System.out.println("*        integer types          *");
		System.out.println("*                               *");
		System.out.println("*8 bit - byteOne = "+byteOne+"\t\t*");
		System.out.println("2 bytes (16 bits) short = "+shorty+"");
		System.out.println("4 bytes (32 bits) integer = "+num+"");
		System.out.println("8 bytes (64 bits) long = "+longboi+"");
		System.out.println("*        decimal types          *");
		System.out.println("4 bytes (32 bits) float = "+floaty+"");
		System.out.println("8 bytes (64 bits) double = "+doubly+"");
		System.out.println("*        other types          *");
		System.out.println("2 bytes (16 bits) char = "+letter+"");
		System.out.println("1 bytes (8 bits) boolean = "+whatup+"");
		System.out.println(" string = "+whatsup+"");












	}
}