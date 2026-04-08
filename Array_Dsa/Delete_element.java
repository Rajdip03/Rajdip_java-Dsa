    package Array_Dsa;

    public class Delete_element {
    public static void main(String[] args) {
    int arr[] = { 1, 3, 8, 80, 90 };
    int delete_element = 80;
    int newarray[] = new int[arr.length - 1];
    int j = 0;
    for (int i = 0; i < arr.length; i++) {
    if (arr[i] != delete_element) {
    newarray[j] = arr[i];
    j++;
    }
    }
    for (int result : newarray) {
    System.out.print(result + " ");
    }
    }
    }

