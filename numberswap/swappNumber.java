 // using a third variable
// public class swappNumber {
//     public static void main(String[] args) {
//         int Rajdip = 100, Rupak = 80;
//         System.out.println("Before swap Rajdip--->" + Rajdip + " " + "Rupak--->" + Rupak);
//         int swap; // using a third variable
//         swap = Rajdip;
//         Rajdip = Rupak;
//         Rupak = swap;
//         System.out.println("After swap Rajdip--->" + Rajdip + " " + "Rupak--->" + Rupak);
//     }
// }

// without taking any extra variable

class swappNumber {
    public static void main(String[] args) {
        int Rajdip = 80, sudip = 60;
        System.out.println("Before swap Rajdip--->" + Rajdip + " " + "sudip--->" + sudip);
        Rajdip = Rajdip + sudip;
        sudip = Rajdip - sudip;
        Rajdip = Rajdip - sudip;
        System.out.println("After swap Rajdip--->" + Rajdip + " " + "sudip--->" + sudip);
    }
}
