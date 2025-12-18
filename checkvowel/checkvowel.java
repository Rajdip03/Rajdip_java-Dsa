public class checkvowel 
{
    public static void main(String []args) {
    char ch='a';
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
            System.out.println("charecter is a vowel");
        }
        else if(ch>='a' && ch<='z')
        {
            System.out.println("charecter is a consonant");
        }
        else
        {
            System.out.println("charecter is a not a alphabet");  
        }
  } 
}
