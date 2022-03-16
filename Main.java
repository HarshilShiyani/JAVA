import java.util.*;
			 class StaticThis
		{	
		  static int count=0;
		  StaticThis(int count)
		  {
		  	this.count=count;
		  	System.out.println("count"+count);
		  }
		}

		public class Main
	{

		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter count=");
			int count=sc.nextInt();
			StaticThis s=new StaticThis(count);
			
		}
	}

