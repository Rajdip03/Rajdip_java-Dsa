package String_Dsa;
import java.util.*;
public class Remove_DuplicateCharacter {
public static void main(String[] args) {
String str;
Scanner sc = new Scanner(System.in);
System.out.println("enter--->");
str = sc.nextLine();
str.toLowerCase();
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
