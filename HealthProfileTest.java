// HealthProfileTest.java

import java.util.Scanner;

public class HealthProfileTest {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.println("Enter first name: ");
        String firstName = input.nextLine();
        
        System.out.println("Enter last name: ");
        String lastName = input.nextLine();

        System.out.println("Enter gender: ");
        String gender = input.nextLine();

        System.out.println("Enter month: ");
        int month = input.nextInt();
        
        System.out.println("Enter day: ");
        int day = input.nextInt();
        
        System.out.println("Enter year: ");
        int year = input.nextInt();

        System.out.println("Enter height: ");
        double height = input.nextDouble();

        System.out.println("Enter weight: ");
        double weight = input.nextDouble();

       HealthProfile rate1 = new HealthProfile(firstName, lastName, gender, month, day, year, height, weight);
        System.out.println();
        System.out.println("Your DoB is: " + month + "/" + day + "/" + year);
        System.out.println("Gender: " + rate1.getGender());
        System.out.printf("%s%d%s%n", "Your age is: " , rate1.getAge()," years");
        System.out.printf("%s%.2f%n%n", "BMI is: ", rate1.calculateBmi());
        System.out.printf("%s%n%s%n%s%n%s%n%s%n%n", "The various BMI Categories are:", "Underweight = <18.5",
        "Normalweight = 18.5 - 24.9", "Overweight = 25 - 29.9", "Obesity = BMI of 30 or greater");
        System.out.printf("%s%.2f%n","Maximum Heart Rate is: ", rate1.calculateMaxHeartRate());
        System.out.print("Heart Rate Range is: ");
        System.out.println(rate1.calculateTargetHeartRateRange1() + " - " + rate1.calculateTargetHeartRateRange2());


    }
}