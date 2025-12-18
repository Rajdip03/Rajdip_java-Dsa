
public class star_patten {
    public static void main(String [] args){
        // for(int i =1; i<=5; i++) //rows
        // {
        //     for(int j = 1; j<=i; j++) //colums
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.print("\n");
        // }
        //in reverse
        // for(int i =1; i<=5; i++)//rows
        // {
        //     for(int j = 5; j>=i; j--) //colums
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.print("\n");
        // }
        // another patten by space
        for(int i =1; i<=8; i++)
        {
            for(int j = i; j<=8; j++)
            {
                System.out.print(" ");    
            }
            for(int k = 1; k<=i; k++)
            {
                System.out.print("*");
            }

            System.out.print("\n");
        }
        //another pattern
        for(int i =1; i<=8; i++)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print(" ");    
            }
            for(int k = i; k<=8; k++)
            {
                System.out.print("*");
            }

            System.out.print("\n");
        }
        //pattern of squre
         for(int i =1; i<=5; i++) //rows
        {
            for(int j = 1; j<=5; j++) // columns
            {
                System.out.print("*");    
            }
            System.out.print("\n");  
        }
        // square---> inside blank
        for(int i =1; i<=8; i++) 
        {
            for(int j = 1; j<=8; j++)
            {
                if(i==1 || i==8 || j==1 || j==8)
                {
                   System.out.print("*");  
                }
                else 
                {
                    System.out.print(" "); 
                }
            }
            System.out.print("\n");  
        } 
        // another pattren
        for()
    }
    
}
