public class checkPalindrom {
    public static void main(String[] args) {
        int number = 151, s = 0, r;
        int c=number;
        while (number > 0) {
            r = number % 10;// 1--8--1
            s = s * 10 + r;// 1--18--181
            number = number / 10;// 18--1--0
        }
        if (c == s) {
            System.out.println(c + "--->This Number is a palindrom number");
        } else {
            System.out.println(c + "--->This Number is not a palindrom number");

        }
    }
}
