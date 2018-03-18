//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Monster implements Comparable
{
	private int myWeight;
	private int myHeight;
	private int myAge;

	//write a default Constructor
	public Monster()
	{
		setHeight(0);
		setWeight(0);
		setAge(0);
	}



	//write an initialization constructor with an int parameter ht
	public Monster(int ht)
	{
		setHeight(ht);
		setWeight(0);
		setAge(0);
	}


	//write an initialization constructor with int parameters ht and wt
	public Monster(int ht, int wt)
	{
		setHeight(ht);
		setWeight(wt);
		setAge(0);
	}



	//write an initialization constructor with int parameters ht, wt, and age
	public Monster(int ht, int wt,int age)
	{
		setHeight(ht);
		setWeight(wt);
		setAge(age);
	}


	//modifiers - write set methods for height, weight, and age
	public void setHeight(int a)
	{
		myHeight = a;
	}
	public void setWeight(int a)
	{
		myWeight = a;
	}
	public void setAge(int a)
	{
		myAge = a;
	}
	
	
	//accessors - write get methods for height, weight, and age
	public int getHeight()
	{
		return myHeight;
	}
	public int getWeight()
	{
		return myWeight;
	}
	public int getAge()
	{
		return myAge;
	}
	
	//creates a new copy of this Object
	public Object clone()
	{
		
	   return new Monster(myHeight,myWeight,myAge);
	}

	public boolean equals( Object obj )
	{
		Monster other = (Monster)obj;
		if(other.getHeight() == getHeight() && other.getWeight() == getWeight() && other.getAge() == getAge())
			return true;

		return false;
	}

	public int compareTo( Object obj )
	{
		Monster rhs = (Monster)obj;
		if(rhs.getHeight() < getHeight())
			return 1;
		else if(rhs.getWeight() < getWeight())
			return 1;
		else if(rhs.getAge() < getAge())
			return 1;
		
		return -1;
	}

	public String toString()
	{
		return getHeight() + " "+ getWeight() + " " + getAge();
	}
	
	
}