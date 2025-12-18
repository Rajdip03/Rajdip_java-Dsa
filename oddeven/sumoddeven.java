//print sum of even or odd
public class sumoddeven 
{
    public static void main(String [] args){
        int n=11,sum=0;
        if(n%2==0)
        {
           for(int i=0; i<=10; i=i+2)
            {
            sum=sum+i;
            }
            System.out.println(sum);
        }
        else
        {
            for(int i=1; i<=11; i=i+2)
            {
            sum=sum+i;
            }
            System.out.println(sum);
        }
    }
}

