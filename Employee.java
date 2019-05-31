// Employee.java

public class Employee {

    String firstName;
    String lastName;
    double monthlySalary;
    double yearlySalary;

    public Employee(String firstNAme, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }
    
     public void setFirstName(String firstName) {
         this.firstName = firstName;
     }
     public String getFirstName() {
         return firstName;
     }
     public void setlastName(String lastName) {
         this.lastName = lastName;
     }
     public String getLastName() {
         return lastName;
     }
     public void setMonthlySalary(double monthlySalary) {
         this.monthlySalary = monthlySalary;
     }
     public double getMonthlySalary() {
         return monthlySalary;
     }

     public double getYearlySalary() {
        if(monthlySalary < 0) {
            System.out.println("INVALID");
        }
         return monthlySalary * 12;
     }
     public double raiseSalary() {
         return (monthlySalary * 1.1)*12;
     }

}

