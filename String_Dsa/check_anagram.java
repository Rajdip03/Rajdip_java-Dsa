package String_Dsa;

import java.util.Arrays;

public class check_anagram {

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        char[] a = str1.toLowerCase().toCharArray();
        char[] b = str2.toLowerCase().toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b)) {
            System.out.println("anagrams");
        } else {
            System.out.println("not anagrams");
        }

    }
}
