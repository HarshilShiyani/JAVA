import java.util.*;
public class Prac3 
 {
   public static void main(String args[])
 {
    Prac3 obj=new Prac3();
    obj.small();
    Prac3 obj1=new Prac3();
    obj1.small();
 }
 void small()
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter 1st Number");
 double no1=sc.nextDouble();
 System.out.println("Enter 2nd Number");
 double no2=sc.nextDouble();
 System.out.println("Enter 3rd Number");
 double no3=sc.nextDouble();
 if(no1>no2)
   {
    if(no1>no3)
    {
      System.out.print("largest"+no1);
    }
    else
      {
      System.out.print("largest"+no3);
    }
   }
  else
   {
      if(no2>no3)
    {
      System.out.print("largest"+no2);
    }
    else
      {
      System.out.print("largest"+no3);
    }
   }
 }
 

 
    


 
 
}

