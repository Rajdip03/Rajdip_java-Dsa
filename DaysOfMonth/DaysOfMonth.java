

public class DaysOfMonth {
    public static void main(String[] args) {
    //    String Month [] ={"january","february","March", "April","May","june","july","august","september","october","november","december"} ;

        // for (int i=0; i < Month.length; i++) {
        //     System.out.println(Month[i]);
        // }
        int MonthNumber=1;
        switch (MonthNumber) 
        {
            case 1:System.out.println("january--->31 Days");
                break;
            case 2:System.out.println("february--->28 Days");
                break;
            case 3:System.out.println("March--->31 Days");
                break;
            case 4:System.out.println("April--->30 Days");
                break;
            case 5:System.out.println("May--->31 Days");
                break;
            case 6:System.out.println("june--->30 Days");
                break;
            case 7:System.out.println("july--->31 Days");
                break;
            case 8:System.out.println("august--->30 Days");
                break;
            case 9:System.out.println("september--->31 Days");
                break;
            case 10:System.out.println("october--->30 Days");
                break;
            case 11:System.out.println("november--->31 Days");
                break;
            case 12:System.out.println("december--->30 Days");
                break;
            default:System.out.println("invalid month");
                break;
        }
    }
}
