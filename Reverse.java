 import java.util.Scanner;


public class Reverse {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.println("Enter String: ");
	
	String str = input.nextLine();
	String reverse = " ";
	
	for(int x = str.length() -1; x>=0; x--){

	reverse = reverse + str.charAt(x);
}

	System.out.println("Reverse String is: " + reverse);

	}

}