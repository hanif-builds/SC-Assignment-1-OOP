package task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> workforce = new ArrayList<>();

        workforce.add(new Developer("Alice", 5000.0, 1000.0));
        workforce.add(new Developer("Charlie", 5500.0, 1200.0));
        workforce.add(new SalesManager("Bob", 4000.0, 0.1, 20000.0));
        workforce.add(new SalesManager("David", 4500.0, 0.15, 25000.0));

        for (Employee employee : workforce) {
            System.out.println(employee.getName() + "'s Pay: $" + employee.calculatePay());
        }
    }
}
