import java.util.*;
	public class CircleArea
	{
		void priCir_Area()
		{
			double sum;
			sum=Math.PI*r*r;
			System.out.println("Area Of Circle"+sum);

		}
		public static void main(String[] args) 
		{
			
			Scanner sc=new Scanner(System.in);
		    double r=sc.nextInt();
			CircleArea c=new CircleArea();
			c.priCir_Area(r);


		}





	}