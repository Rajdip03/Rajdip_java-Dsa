package Array_Dsa;

public class Search_element { 

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 7, 9 };
        int search = 3;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                found = true;
                System.out.println(search + "=>found in index number-->1");
                break;
            }
        }
        if (!found) {
            System.out.println(search + "=>not found");
        }
    }
}

