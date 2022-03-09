import java.util.*;
	public class CountObject
	{
		static int countobj=0;
		CountObject()
		{
			countobj++;

			
		}

		public static void main(String[] args) 
		{
			 CountObject obj1=new CountObject();
			 CountObject obj2=new CountObject();
			 CountObject obj3=new CountObject();
			 CountObject obj4=new CountObject();

    			System.out.println("Total Created Object="+countobj);
		}
	}