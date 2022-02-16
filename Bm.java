import java.util.Scanner;
public class Bm 
{
public static void main(String args[])
{
 Scanner bm=new Scanner(System.in);
 System.out.println("Enter Height in inch");
 double height=bm.nextDouble();
 System.out.println("Enter Weight in pounds");
 double weight=bm.nextDouble();
 double bm1=(weight*0.453592)/(height*0.0254*height*0.0254);
 System.out.println("Your BM1 is"+bm1);
}
}