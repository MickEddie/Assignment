// EmployeeTest.java

public class EmployeeTest {

    public static void main(String[] args) {
        Employee staff1 = new Employee("Ada", "John", 2000);
        Employee staff2 = new Employee("Luke", "Stone", 1500);
        
        System.out.printf("%n%s%.2f%n", "Ada John's Annual Salary is: ", staff1.getYearlySalary());
        System.out.printf("%s%.2f%n%n", "Luke Stone's Annual Salary is: ", staff2.getYearlySalary());

        System.out.printf("%s%.2f%n", "Ada John's new Annual Salary is: ", staff1.raiseSalary());
        System.out.printf("%s%.2f%n%n", "Luke Stone's new Annual Salary is: ", staff2.raiseSalary());

    }
}