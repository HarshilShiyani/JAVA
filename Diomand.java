import java.util.*;
public class Diomand
{

public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
        System.out.print("Input n=");
        int n= sc.nextInt();

       for(int i=1;i<=n;i++) 
         {

            
            for (int j=1;j<=n;j++) 
            {
                if(j<=n-i) 
                {
                    System.out.print("  ");
                }
                else 
                {
                    System.out.print("* ");
                }
            }
            
             for ( int j=2;j<=i;j++) 
             {
                 System.out.print("* ");
             }
          
            
            

             
            System.out.println(""); 
        } 
       

       for(int i=n-1;i>0;i--) 
         {

            
            for (int j=1;j<=n;j++) 
            {
                if(j<=n-i) 
                {
                    System.out.print("  ");
                }
                else 
                {
                    System.out.print("* ");
                }
            }
            
             for ( int j=2;j<=i;j++) 
             {
                 System.out.print("* ");
             }
          
            
            

             
            System.out.println(""); 
        } 
       
}
}
