import java.util.Scanner;
public class MaxMin
{
	public static void main(String args[])
{
	Scanner mxn=new Scanner(System.in);
	System.out.println("Enter a");
	int a=mxn.nextInt();
	System.out.println("Enter b");
	int b=mxn.nextInt();
	if(a>b)
	{
		System.out.println("a is large"+a);
	}
	else
	{
		System.out.println("b is large");
	}


}	
}