//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Line
{
	private double xOne,yOne, xTwo, yTwo;

	public Line(double x1, double y1, double x2, double y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}


	public double calculateSlope( )
	{
		return (yTwo - yOne)/(xTwo - xOne);
		
	}

	public void print( )
	{
		System.out.println("Slope of the line:");
		System.out.printf("%.2f\n",calculateSlope());


	}
}