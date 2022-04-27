import java.util.*;
class Lab82
{
	public static void main(String[] args)
	{
		int sum=0;
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<5;i++)
		{
		try
		{
		if(a[i]<0)
		{
			throw new Exception("Enter Only Positive Number");
		}
		if(a[i]%10==0)
		{
			throw new Exception("Enter Only Non divided Number");
		}
		if(a[i]>1000&&a[i]<2000)
		{
			throw new Exception("Enter Only  Number Between 1000-2000");
		}

		if(a[i]>7000)
		{
			throw new Exception("Enter Only  Number Between Less than 7000");
		}
		else
		{
			sum=sum+a[i];
		}

	}

	catch(Exception e)
	{

		System.out.println(e);
	}

    }
    System.out.println("Answer="+sum);
}
}