class Employee {
    double basicSalary;

    Employee(double salary) {
        this.basicSalary = salary;
    }

    double calculateBonus() {
        return basicSalary * 0.10;
    }
}

class Manager extends Employee {
    Manager(double salary) {
        super(salary);
    }

    double calculateBonus() {
        return basicSalary * 0.15;
    }
}

class SeniorManager extends Manager {
    SeniorManager(double salary) {
        super(salary);
    }

    double calculateAdditionalBonus() {
        return basicSalary * 0.05;
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        SeniorManager sm = new SeniorManager(60000);
        System.out.println("Basic Salary: " + sm.basicSalary);
        System.out.println("Bonus: " + sm.calculateBonus());
        System.out.println("Additional Bonus: " + sm.calculateAdditionalBonus());
        System.out.println("Total Salary: " + (sm.basicSalary + sm.calculateBonus() + sm.calculateAdditionalBonus()));
    }
}
