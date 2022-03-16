import java.util.*;
	 class BankMethod
	{	
		double accountno;
		String userName;
		String email;
		String accountType;
		double accountBalance;
		
		 void getAccountDetails()
		{

			Scanner sc=new Scanner(System.in);
			System.out.print("Enter Accounr Number=");
			accountno=sc.nextDouble();
			System.out.print("User Name=");
			userName=sc.next();
			System.out.print("Enter email Id=");
			email=sc.next();
			System.out.print("Enter AccountType=");
			accountType=sc.next();
			System.out.print("Enter accountBalance=");
			accountBalance=sc.nextDouble();

		}
		 void displayAccountDetails()
		{
			System.out.println("\n");
			System.out.println("Your Accounr Number=="+accountno);
			System.out.println("Name=="+ userName);
			System.out.println("Your email Id=="+email);
			System.out.println("Your AccountType=="+accountType);
			System.out.println("Your accountBalance=="+accountBalance);

		}
		
	}
	public class Bank
	{

		public static void main(String[] args) {
			BankMethod bn=new BankMethod();
			bn.getAccountDetails();
			bn.displayAccountDetails();
			
		}
	}

