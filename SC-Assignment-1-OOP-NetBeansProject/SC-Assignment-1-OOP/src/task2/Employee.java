package task2;

public class Employee {

    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public double calculatePay() {
        return baseSalary;
    }
}

class Developer extends Employee {
    private double techAllowance;

    public Developer(String name, double baseSalary, double techAllowance) {
        super(name, baseSalary);
        this.techAllowance = techAllowance;
    }

    @Override
    public double calculatePay() {
        return baseSalary + techAllowance;
    }
}

class SalesManager extends Employee {
    private double commissionRate;
    private double totalSales;

    public SalesManager(String name, double baseSalary, double commissionRate, double totalSales) {
        super(name, baseSalary);
        this.commissionRate = commissionRate;
        this.totalSales = totalSales;
    }

    @Override
    public double calculatePay() {
        return baseSalary + commissionRate * totalSales;
    }
}
