//fibonachi series---> 0 1 1 2 3 5 8
import java.util.Scanner;
public class fibonachi {

    public static void main(String[] args) {
        int n;
        int a = 0, b = 1, c;
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
