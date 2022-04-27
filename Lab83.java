import java.util.*;
class Lab83{

	public static void main(String[] args) {
		
	
	double totalMoney=10000.00;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Money You want too Withdraw=");
	double withdraw=sc.nextDouble();

	try{

	if(totalMoney<withdraw)
	{
		throw new Exception("Your Withdrawing money is larger than Total_Money");
	}
	if(withdraw<1)
	{
		throw new Exception("Your Withdrawing money is In Negative");
	}
	else
	{
		totalMoney=totalMoney-withdraw;
		System.out.println("Your Wthdrawal"+" "+withdraw+" "+"Sucessfully.");
		System.out.println("Your Latest balance"+" "+totalMoney);
	}
	}
	catch(Exception e)
	{
		e.printStackTrace();
		System.out.print(e);
	}
} 
}