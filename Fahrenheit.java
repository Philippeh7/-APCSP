//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Fahrenheit
{
	private double fahrenheit;

	public void setFahrenheit(double fahren)
	{
		fahrenheit = fahren;
	}

	public double getCelsius()
	{
		return ((fahrenheit - 32) *5)/9;
	}

	public void print()
	{
		System.out.println(fahrenheit + " degrees Fahrenheit ==  "  + String.format("%.2f", getCelsius())+"  degrees Celsius");
		
	}
}