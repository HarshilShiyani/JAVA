import java.util.*;
abstract class Vegetable
	{
		abstract public String toString();
	}	
class Potato extends Vegetable
	{
	  public String toString()
	  {
	  	String name_colour="Potato,Brown";
	  	return name_colour;
	  }
	}
class Brinjal extends Vegetable
	{
		public String toString()
	  {
	  	String name_colour="Brinjal,Purple";
	  	return name_colour;
	  }
	
	}
class Tomato extends Vegetable
	{
		public String toString()
		{
	  	String name_colour="Tomato,red";
	  	return name_colour;
		
		}
}

class VegetableDemo{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enetr Vagetable=");
		String veg=sc.next();
		if(veg.equals("Tomato"))
		{
			Tomato t=new Tomato();
			String ans=t.toString();
			System.out.println("Fianl Output="+ans);
		}
		else if(veg.equals("Brinjal"))
		{
			Brinjal t=new Brinjal();
			String ans=t.toString();
			System.out.println("Fianl Output="+ans);
		}
		else if(veg.equals("Potato"))
		{
			Potato t=new Potato();
			String ans=t.toString();
			System.out.println("Fianl Output="+ans);

		}
		else
		{
			System.out.print("Enetr Valid Vegetable");
		}
		
	}
}	
