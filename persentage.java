import java.util.*;
public class persentage
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Maths Marks=");
		int math=sc.nextInt();
		System.out.println("Enter Physics Marks=");
		int phy=sc.nextInt();
		System.out.println("Enter Chemistry Marks=");
		int che=sc.nextInt();
		System.out.println("Enter English Marks=");
		int eng=sc.nextInt();
		System.out.println("Enter Computer  Marks=");
		int com=sc.nextInt();
		System.out.println();
		int total=math+phy+che+eng+com;
		float pr=(100*total)/500;
		if(pr>=60&&pr<=100)
		{
			System.out.println("First");
		}
		else if(pr>=50&&pr<=60)
		{
			System.out.println("second");
		}
		else if(pr>=40&&pr<=50)
		{
			System.out.println("third");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}