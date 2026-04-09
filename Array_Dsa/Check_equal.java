package Array_Dsa;

import java.util.Arrays;
public class Check_equal {
   
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3 };
        int arr2[] = { 1, 2, 3 };

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("its equals");
        } else {
            System.out.println("not equals");
        }
    }
}

