public class primeNumber {
    public static void main(String[] args) {
        int number=7,count=0;
        for(int i=1; i<=number;i++)
        {
            if(number%i==0)
            {
                // System.out.println(i);
                count++;
            }
        }
        if(count==2)
            {
               System.out.println("prime number"); 
            }
            else 
            {
                System.out.println("not a prime number"); 
            }
    }
}
