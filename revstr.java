import java.util.*;
public class revstr
{
	public static void main(String[] args) 
{
		Scanner sc=new Scanner(System.in);
	
     System.out.println("Enter Any Word=");
     String str1=sc.next();
     int l=str1.length();
     String str2="";
     for(int i=l-1;i>=0;i--)
     {
     	str2=str2+str1.charAt(i);
     }
     if(str1.equals(str2))
	   {
	   		System.out.println("number is palindrom");
	   }
	    else
	   {
	   		System.out.println("Not a palindrom");
	   }
	   
	    

}
}	