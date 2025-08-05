import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee{
    private String name;
    private int age;
    private int salary;
    
    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }
}

    class Salary implements Comparator<Employee> {
        public int compare(Employee emp1, Employee emp2){
            return Double.compare(emp2.getSalary(), emp1.getSalary());
        }
    }

    class NameCompare implements Comparator<Employee> {
        public int compare( Employee emp1, Employee emp2){
            return emp1.getName().compareTo(emp2.getName());
        }
    }

    


public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> emp = new ArrayList<>();
        emp.add(new Employee("Aman" , 22, 45000));
        emp.add(new Employee("Yash" , 25, 60000));
        emp.add(new Employee("Arjun" , 60, 2000));
        emp.add(new Employee("Torang" , 20, 40000));

        Collections.sort(emp, new  Salary());
        System.out.println("Employees sorted by Salary: ");
        for (Employee e : emp) {
            System.out.println(e.getName() + "  Age: " + e.getAge() + "  Salary: " + e.getSalary());
        }


        Collections.sort(emp, new NameCompare());
        System.out.println("\nEmployees sorted by Names: ");
        for (Employee e : emp) {
            System.out.println(e.getName() + " | Age: " + e.getAge() + "  Salary: " + e.getSalary());
        }

    }
    
}
