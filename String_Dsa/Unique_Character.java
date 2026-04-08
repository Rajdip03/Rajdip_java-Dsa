package String_Dsa;

public class Unique_Character {
public static void main(String[] args) {
String s = "Rajdip Mondal";
int count[] = new int[256];// it show how many times each character appear
for (char ch : s.toCharArray()) {
count[ch]++;
}
for (char ch : s.toCharArray()) {
if (count[ch] == 1) {
System.out.print("" + ch);
}

}

}
}

