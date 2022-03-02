 import java.util.Scanner;
 public class averiv
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array length");
		int n=sc.nextInt();
		int a[]=new int[n];
		int sum=0;
		for(int i=0;n>i;i++) 
		{
			System.out.println("array of"+i);
			a[i]=sc.nextInt();
			

		}
		for(int j=n;n<=j;j--) 
		{
			System.out.println("rivers order is "+a[j]);
			
			

		}
		
		 
	}
}
