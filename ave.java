 import java.util.Scanner;
 public class ave
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int sum=0;
		for(int i=0;5>i;i++) 
		{
			System.out.println("array of"+i);
			a[i]=sc.nextInt();
			sum=sum+a[i];

		}
		System.out.println("average"+(sum/5));
		 
	}
}
