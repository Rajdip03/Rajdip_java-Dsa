// <----birth year in fibonachi series--->
package fibonachi_birth_Year;

import java.util.*;

public class birth_year {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your birth year");
        int year = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        while (c < year) {
            System.out.print(c + " ");
            c = a + b;
            a = b;
            b = c;
        }
        if (c == year) {
            System.out.println(year + " is a fibonachi year");
        } else {
            System.out.println(year + " not a fibonachi year");
        }
        sc.close();
    }
}
