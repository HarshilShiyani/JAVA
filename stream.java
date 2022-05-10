import java.util.Scanner;
 public class stream	
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Any String=");  
		String str=sc.next();
		int l=str.length();
		System.out.println("LENGTH"+l);
		for(int j=0;l>j;j++)
		{
		for(int i=0;j>i;i++)
		{
			char ch=str.charAt(i);
			if(j<(l/2))
			{
				System.out.print(" ");
			}
			else
			{
			
			System.out.print(ch);
			}
		}
			System.out.println("\n");
		}
		
		
		
	

		
		
		
	

		


	}
}