public class checkLeapYear {
    public static void main(String[] args) {
       int year=2020;
        if (year%100==0 && year%400==0 || year%100!=0 && year%4==0) //year%100==0 && year%400==0--->[for century]......year%100!=0 && year%4==0--->[for year]
        {
            System.out.println(year +"--->This a Leap Year");
        } 
        else 
        {
            System.out.println(year +"--->This not a Leap Year");
        }
    }
}
