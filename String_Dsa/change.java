package String_Dsa;

public class change
{

    public static void main(String[] args) {
        String str = "i am a best developer";
        String oldSub = "a";
        String newSub = "the";
        String result = "";
        int count = 0;
        int n = 1;
        for (int i = 0; i < str.length(); i++) {
            boolean match = true;
            for (int j = 0; j < oldSub.length(); j++) {
                if (i + j >= str.length() || str.charAt(i) != oldSub.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match && count < n) {

            }
        }
    }
}
