//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Name
{
	private String name;

	public Name()
	{
		name = "Philippe Hansen";

	}

	public Name(String s)
	{
		name = s;

	}

   public void setName(String s)
   {
	   name = s;
   }

	public String getFirst()
	{
		int substringindex = name.indexOf(" ");
		return name.substring(0,substringindex);
	}

	public String getLast()
	{
		int substringindex = name.indexOf(" ");
		return name.substring(substringindex+1, name.length());
	}

 	public String toString()
 	{
 		return getFirst() + " " + getLast();
	}
}