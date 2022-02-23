import java.util.*;
public class rev
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	
     System.out.println("Enter Any Number=");
	   int n=sc.nextInt();
	   int temp=n;
	   int rem;
	   int rev=0;
	   while(n>0)
	   {
	   		rem=n%10;
	   		rev=rem+(rev*10);
	   		n=n/10;
	   	}

	   	System.out.println(rev);
	   
	   if(rev==temp)
	   {
	   		System.out.println("number is palindrom");
	   }
	    else
	   {
	   		System.out.println("Not a palindrom");
	   }

	   }
}	