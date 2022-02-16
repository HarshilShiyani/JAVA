import java.util.Scanner;
public class presecedence
{
public static void main(String args[])
{
    Scanner sn=new Scanner(System.in);
    System.out.println("Enter a");
    int a=sn.nextInt();
    System.out.println("Enter b");
    int b=sn.nextInt();
    System.out.println("Enter c");
    int c=sn.nextInt();
    int d=a*b+c/b;
    System.out.println(d);
}
}
