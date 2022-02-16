import java.util.Scanner;
public class CesToFern
{
public static void main(String args[])
{
 Scanner temp=new Scanner(System.in);
 System.out.println("Enter Temp in celcius");
 int c=temp.nextInt();

 int f=(9*c)/5+32;
System.out.println("Temp In fernhit is "+f);
}
}
