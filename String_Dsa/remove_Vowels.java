package String_Dsa;

public class remove_Vowels {

    public static void main(String[] args) {

        String name = "RAjdip";
        String result = "";
        // for(int i =0; i< name.length(); i++)
        // {
        // char ch = name.charAt(i);
        // if("aeiou".indexOf(ch) == -1)
        // {
        // result += ch;
        // }
        // }
        for (char ch : name.toCharArray()) {
            if ("aeiou".indexOf(ch) == -1) {
                result += ch;
            }
        }
        System.out.println(result);
    }
}
