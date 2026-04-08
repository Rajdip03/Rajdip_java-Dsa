package Array_Dsa;

public class Insert_new_element {
public static void main(String[] args) {
int marks[] = { 79, 74, 86, 87, 80 };
int New_marks = 90;
int position = 5;
int newArray[] = new int[marks.length + 1];

for (int i = 0; i < position; i++) {
newArray[i] = marks[i];
}
newArray[position] = New_marks;

for (int i = position; i < marks.length; i++) {
newArray[i + 1] = marks[i];
}
for (int result : newArray) {
System.out.print(result + " ");
}
}
}
