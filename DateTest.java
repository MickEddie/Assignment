// DateTest.java

import java.util.Scanner;

public class DateTest {


    public static void main(String [] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter month: ");
    int month = input.nextInt();
     System.out.println("Enter day: ");
     int day = input.nextInt();
     System.out.println("Enter year: ");
     int year = input.nextInt();

    Date d1 = new Date(month, day, year);
    System.out.println(d1.displayDate());
    }
}