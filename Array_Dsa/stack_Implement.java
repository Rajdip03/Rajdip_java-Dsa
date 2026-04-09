package Array_Dsa;

public class stack_Implement {
   
    int arr[] = new int[5];
    int top = -1;

    void push(int x) {
        if (top == arr.length - 1) {
            return;
        } else {
            arr[++top] = x;
        }
    }

    int pop() {
        if (top == -1) {
            return -1;
        } else {
            return arr[top--];
        }
    }
    public static void main(String[] args) {
        stack_Implement c = new stack_Implement();
        c.push(10);
        c.push(20);
        System.out.println(c.pop());
    }
}

