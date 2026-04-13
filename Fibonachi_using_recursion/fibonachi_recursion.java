package Fibonachi_using_recursion;

public class fibonachi_recursion {
    public class cbnits {

        static int test(int n) {
            if (n <= 1) {
                return n;
            } else {
                return test(n - 1) + test(n - 2);
            }
        }

        public static void main(String[] args) {
            int n = 7;
            System.out.println(test(n));
        }
    }
}
