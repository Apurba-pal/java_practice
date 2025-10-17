// Q5 create a class employee with method calculate bonus(). subclass manager and developer should override the method with different bonus percentages. 
class Employee {
    public void calculateBonus() {
        System.out.println("Employee bonus calculation");
    }
}

class Manager extends Employee {
    @Override
    public void calculateBonus() {
        System.out.println("Manager bonus calculation: 20%");
    }
}

class Developer extends Employee {
    @Override
    public void calculateBonus() {
        System.out.println("Developer bonus calculation: 15%");
    }
}

public class TestBonus {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.calculateBonus();

        Employee mgr = new Manager();
        mgr.calculateBonus();

        Employee dev = new Developer();
        dev.calculateBonus();
    }
    
}
