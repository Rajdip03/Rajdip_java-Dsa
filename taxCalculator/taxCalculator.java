
public class taxCalculator {
    public static void main(String[] args) {
        int salary = 600000;
        if (salary < 50000) {
            System.out.println(salary + "--->no Tax");
        } else if (salary > 50000 && salary < 100000) {
            System.out.println(salary + "--->10% Tax=" + salary * 0.10);
        } else if (salary > 100000) {
            System.out.println(salary + "--->20% Tax=" + salary * 0.20);
        } else {
            System.out.println("Not have any job so thats why don,t give any tax");
        }
    }
}
