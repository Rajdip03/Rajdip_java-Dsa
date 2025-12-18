public class sumofDigit {
    public static void main(String[] args) {
        int digit = 12345, n;
        int sum = 0;
        while (digit != 0) 
        {
            n = digit % 10; //
            sum = sum + n; //
            digit=digit/10; //
        
        }
        System.out.println(sum);
    }
}

