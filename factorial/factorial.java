public class factorial {
    public static void main(String[] args) {
        int factorialnumber = 5;
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial = i * factorial;

        }
        System.out.println(factorial);
    }
}
