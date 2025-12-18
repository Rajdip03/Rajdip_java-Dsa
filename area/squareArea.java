package area;
import java.util.*;

public class squareArea {
    public static void main(String[] args) {
        int side;

        System.out.println("Enter your square side");
        Scanner sc = new Scanner(System.in);
        side = sc.nextInt();
        int squareArea=side*side;
        System.out.println("Area of square is--->"+ (squareArea));
    }
}
