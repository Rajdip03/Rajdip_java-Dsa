package String_Dsa;

public class Reverse {

    public static void main(String[] args) {
        String str = "java is best";

        String words[] = str.split(" ");
        // String result="";
        for (String word : words) {
            String rev = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                rev += word.charAt(i);
            }
            System.out.print(rev + " ");
        }

    }
}
