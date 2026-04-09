package String_Dsa;

public class countVowels_consonant {

    public static void main(String[] args) {
        String str = "java is fun";
        int vowels = 0;
        int consonant = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonant++;
                }
            }
        }
        System.out.println(vowels);
        System.out.println(consonant);
    }
}
