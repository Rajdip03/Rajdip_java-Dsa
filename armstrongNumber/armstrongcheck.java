public class armstrongcheck {
    public static void main(String[] args) {
        int number = 153,r,s=0;// armstrong--->(1*1*1 + 8*8*8 + 1*1*1 = 181)
        int c =number;
        while(number > 0)
        {
            r=number %10;
            s=(r*r*r)+s;
            number=number/10;
        }
        if(c==s)
        {
            System.out.println(c +"---> This number is a armstrong number");
        }
        else 
        {
            System.out.println(c +"---> This number is not a armstrong number");

        }
    }
}
