import java.util.ArrayList;

class Employee {

    String name;
    String department;
    int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", department=" + department + ", salary=" + salary + "]";
    }
    
}

class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Shailesh", "Engineering", 100000));
        employees.add(new Employee("Piyush", "Engineering", 100000));
        employees.add(new Employee("Shreyas", "HR", 100000));

        System.out.println(employees);

        
    }
}

