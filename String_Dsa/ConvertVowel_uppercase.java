package String_Dsa;

public class ConvertVowel_uppercase {

    public static void main(String[] args) {
        String str = "Rajdip".toLowerCase();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ("aeiou".indexOf(ch) != -1) {
                result += Character.toUpperCase(ch);
            } else {
                result += ch;
            }
        }
        System.out.println(result);
    }
}
