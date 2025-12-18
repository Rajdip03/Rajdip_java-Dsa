public class perfectNumber {
   public static void main(String [] args){
    int number=6,sum=0;
    for(int i =1; i<number; i++)
    {
        if(number%i==0)
        {
            sum=sum+i;
        }
    }
    if(sum==number)
    {
        System.out.println(number +"--->This number is a perfect number");
    }
    else 
    {
                System.out.println(number +"--->This number not is a perfect number");
    }
   }
}
