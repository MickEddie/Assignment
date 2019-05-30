// InvoiceTest.java

import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    System.out.println("Enter part number: ");
    String partNumber = input.nextLine();
    
    System.out.println("Enter part description: ");
    String partDescription = input.nextLine();

    System.out.println("Enter quantity: ");
    int quantity = input.nextInt();

    System.out.println("Enter price: ");
    double price = input.nextDouble();

    Invoice abc1 = new Invoice(partNumber, partDescription, quantity, price);
    System.out.println(abc1.getInvoiceAmount());
    }
}