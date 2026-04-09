package String_Dsa;

public class duplicate_element {

    public static void main(String[] args) {
        String str = "Rajdip Mondal";
        str.toLowerCase();
        int count[] = new int[256];
        for (char ch : str.toCharArray()) {
            count[ch]++;
        }
        for (char ch : str.toCharArray()) {
            if (count[ch] > 1) {
                System.out.print(ch + " ");
                count[ch] = 0;
            }
        }
    }
}

