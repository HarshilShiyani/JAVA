import java.util.*;
	public class MethodTemp
	{
		static void print_temp(double cels)
		{
			double fern;
			fern=(cels*9)/5 +32;
			System.out.println("Temprature in Celcius "+fern);

		}
		public static void main(String[] args) 
		{
			System.out.println("enter temp in cels ");
			Scanner sc=new Scanner(System.in);
		    double cels=sc.nextDouble();
			print_temp(cels);


		}





	}