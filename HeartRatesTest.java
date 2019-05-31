// HeartRatesTest.java

import java.util.Scanner;

public class HeartRatesTest {


    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter first name: ");
    String firstName = input.nextLine();
        System.out.println("Enter last name: ");
        String lastName = input.nextLine();
        System.out.println("Enter month: ");
        int month = input.nextInt();
            System.out.println("Enter day: ");
            int day = input.nextInt();
            System.out.println("Enter year: ");
            int year = input.nextInt();

            HeartRates rate1 = new HeartRates(firstName, lastName, month, day, year);
            System.out.println(month + "/" + day + "/" + year);

            System.out.printf("%s%d%s%n", "Age is: " ,rate1.getAge()," years");

            System.out.printf("%s%.2f%n","Maximum Heart Rate is : ", rate1.calculateMaxHeartRate());
            System.out.print("Heart Rate Range is: ");
            System.out.println(rate1.calculateTargetHeartRateRange1() + " - " + rate1.calculateTargetHeartRateRange2());


    }
}