package Array_Dsa;
import java.util.Arrays;
public class Copy_element {
public static void main(String[] args) {
int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
int coppyarray[] = {};

System.out.println("my first array");
for (int i = 0; i < arr.length; i++) {
System.out.print(arr[i] + " ");
}

System.out.print("\n my second array--->");
coppyarray = Arrays.copyOf(arr, 9);
for (int i = 0; i < coppyarray.length; i++) {
// coppyarray[i] = arr[i];
System.out.print(coppyarray[i] + " ");
}
}
}

