import java.util.*;
public class Palindrom
{

public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
        System.out.print("Input the string== ");
        String str1= sc.nextLine();
        StringBuffer str2=new StringBuffer(str1);
        str2.reverse();
         if(str1.equals(str2.toString()))
         {
         	System.out.println("Palindrom");
         }
         else
         {
         	System.out.println("Not Palindrom");
         }	
	}
}
