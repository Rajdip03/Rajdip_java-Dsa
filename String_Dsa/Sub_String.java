package String_Dsa;
import java.util.*;
public class Sub_String {
    public static void main(String [] args){
        String str;
        Scanner sc = new Scanner(System.in)
        System.out.println("Enter your name");
        str=sc.nextLine();
        for(int i =0; i<str.length();i++)
        {
            String temp="";
            for(int j=i; j< str.length();j++)
            {
                temp +=str.charAt(j);
                System.out.println(temp);
                // System.out.println(str.substring(i , j));
            }
        }
    }
} 

