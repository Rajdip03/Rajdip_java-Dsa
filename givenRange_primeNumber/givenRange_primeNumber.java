public class givenRange_primeNumber {
    public static void main(String[] args) {
        int firstRange = 10;
        int secondRange = 151;
        int i,j;
        for ( i = firstRange; i <= secondRange; i++) 
        {
            for ( j = 10; j <= i; i++) 
            {
                if (i % j == 0)
                    break;
            }
            if (i == j)
            {
             System.out.println(j);
            }
            
        }
    }
}
