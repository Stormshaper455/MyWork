package time;
import java.util.Scanner;
public class Palindrome {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a three digit num:");
	int num = sc.nextInt();
	if (num >=100) {
	int hun = num /100;
	int ones = num % 10;
		if (hun == ones) {
	System.out.println("This is a palindrome!");
		}
		else {
			System.out.println("This is NOT a palindrome");

		}
		
	}
	else {
		System.out.println("Please enter a 3 digit number");
	}
}
}
