interface BasicSalary {
    double getBasicSalary();
}

interface Bonus {
    double calculateBonus(double salary);
}

class Employee implements BasicSalary, Bonus {
    double basicSalary;

    Employee(double salary) {
        this.basicSalary = salary;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double calculateBonus(double salary) {
        return salary * 0.10;
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Employee emp = new Employee(50000);
        System.out.println("Basic Salary: " + emp.getBasicSalary());
        System.out.println("Bonus: " + emp.calculateBonus(emp.getBasicSalary()));
        System.out.println("Total Salary: " + (emp.getBasicSalary() + emp.calculateBonus(emp.getBasicSalary())));
        System.out.println();
    }
}
