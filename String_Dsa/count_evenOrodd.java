package String_Dsa;

public class count_evenOrodd {
   

    public static void main(String[] args) {
        String str = "java is fun";
        String words[] = str.split(" ");
        int even = 0;
        int odd = 0;
        for (String word : words) {
            if (word.length() % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println(even);
        System.out.println(odd);

    }
}
