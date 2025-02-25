interface BasicSalary {
    double getBasicSalary();
}

interface Bonus {
    double calculateBonus(double salary);
}

class Employee implements BasicSalary {
    double basicSalary;

    Employee(double salary) {
        this.basicSalary = salary;
    }

    public double getBasicSalary() {
        return basicSalary;
    }
}

class Manager extends Employee implements Bonus {
    Manager(double salary) {
        super(salary);
    }

    public double calculateBonus(double salary) {
        return salary * 0.15;
    }
}

class Developer extends Employee implements Bonus {
    Developer(double salary) {
        super(salary);
    }

    public double calculateBonus(double salary) {
        return salary * 0.10;
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        Manager mgr = new Manager(60000);
        Developer dev = new Developer(50000);

        System.out.println("MANAGER:");
        System.out.print("-------------------\n");
        System.out.println("Basic Salary: "+mgr.getBasicSalary());
        System.out.println("Bonus: "+mgr.calculateBonus(mgr.getBasicSalary()));
        System.out.println("Total Salary: "+(mgr.getBasicSalary()+mgr.calculateBonus(mgr.getBasicSalary())));

        System.out.println("\nDEVELOPER:");
        System.out.print("-------------------\n");
        System.out.println("Basic Salary: "+dev.getBasicSalary());
        System.out.println("Bonus: "+dev.calculateBonus(dev.getBasicSalary()));
        System.out.println("Total Salary: "+(dev.getBasicSalary()+dev.calculateBonus(dev.getBasicSalary())));
    	System.out.println();
    }
}
