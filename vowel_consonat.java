 import java.util.Scanner;
 public class vc
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any string");  
		int v=0,c=0;
		String str1=sc.next();
		String str2=str1.toLowerCase();
		int l=str1.length();
		for(int i=0;l>i;i++)
		{  
			char ch=str2.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				v++;

			}
			else
			{
				c++;
			}
		}

               System.out.println("vowel is="+v);  
               System.out.println("consonant is="+c);  
	}
}
