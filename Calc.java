import java.util.Scanner;
public class Calc
{
	public static void main(String args[])
{
	Scanner clc=new Scanner(System.in);
	System.out.println("Enter first number a");
	float a=clc.nextFloat();
	System.out.println("Enter second number b");
	float b=clc.nextFloat();
	
	System.out.println("Enter any one character[+ - * /]");
	String c=clc.next();  
	 
	 if(c.compareTo("+")==0)
	 {
		System.out.println(a+b);
	}
	else if(c.compareTo("-")==0)
	 {
		System.out.println(a-b);
	}	
	else if(c.compareTo("*")==0)
	 {
		System.out.println(a*b);
	}
	else if(c.compareTo("/")==0)
	 {
		System.out.println(a/b);
	}
	else
	{
		System.out.println("Enter only + - * / ");
	}
	
}	
}