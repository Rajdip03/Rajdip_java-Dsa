 
/* 
//not taking any input from run time
public class oddeven 
{
    public static void main(String[] args) {
        int num=80;
        if(num%2==0)
        {
            System.out.println("number is even number");
        }
        else
        {
          System.out.println("number is odd number");
        }
    }
}*/

//taking input from run time
import java.util.*;
class oddeven 
{
    public static void main(String [] args)
    {
        int num;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter ur number");
       num=sc.nextInt();
        if(num%2==0)
        {
           System.out.println("even number"); 
        }
        else
        {
            System.out.println("odd number");
        }
    }
}
