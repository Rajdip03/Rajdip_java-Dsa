public class Calculator {
    public static void main(String[] args) {
        int a = 8, b = 3;
        int calculatechoice = 1;
        if (calculatechoice == 1) {
            System.out.println("Addition of 8 and 3 is=" + (8 + 3));
        } else if (calculatechoice == 2) {
            System.out.println("Subtraction of 8 and 3 is=" + (8 - 3));
        } else if (calculatechoice == 3) {
            System.out.println("Multiplication of 8 and 3 is=" + (8 * 3));
        } else if (calculatechoice == 4) {
            System.out.println("Division of 8 and 3 is=" + (8 / 3));
        } else if (calculatechoice == 5) {
            System.out.println("power of 8 and 3 is=" + (8 ^ 3));
        } else {
            System.out.println("invalid");
        }
    }
}
