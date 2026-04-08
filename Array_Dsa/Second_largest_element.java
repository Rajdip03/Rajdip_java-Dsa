package Array_Dsa;

public class Second_largest_element {
class cbnits {
public static void main(String[] args) {
int arr[] = { 10, 30, 40, 80, 90 };

int max = Integer.MIN_VALUE;
int Second = Integer.MIN_VALUE;

for (int i : arr) {
if (i > max) {
Second = max;
max = i;
} else if (i > Second && i != max) {
Second = i;
}
}
System.out.print(Second + " ");
}
}
}
