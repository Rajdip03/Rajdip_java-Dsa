public class countDigit {
    public static void main(String[] args) {
        int digitnumber = 808080, count = 0;//1--->2--->3--->4--->5--->6
        for (int i = 1; i < digitnumber; i++) {
            digitnumber=digitnumber/10; //80808-->8080.8--->808.08--->80.808--->8.0808--->0.80808
            count++;
        }
        System.out.println(count);
    }
}