package String_Dsa;
import java.util.*;

class numberUniqueCharacter {

    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name");
        str = sc.nextLine();
        str = str.toLowerCase();
        HashSet<Character> uniquecharacter = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                uniquecharacter.add(ch);
            }
        }
        System.out.println(uniquecharacter);
        System.out.println(uniquecharacter.size());
    }
}

