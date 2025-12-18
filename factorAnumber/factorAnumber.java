public class factorAnumber {
    public static void main(String[] args) {
        int factornumber = 8;
        for (int i = 1; i <= 8; i++) {
            if (factornumber % i == 0) {
                System.out.println(i);
            }
        }
    }
}
