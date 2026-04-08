package Array_Dsa;

public class Largest_element {
public static void main(String[] args) {
int arr1[] = { 1, 2, 3, 5, 8 };
int max = arr1[0];

for (int i = 0; i < arr1.length; i++) {
if (i > max) {
max = arr1[i];
}
}
System.out.println(max + " ");
}
}


