package time;
import java.util.Scanner;
import java.util.Random;
public class Randommath {
	public static void main (String [] args) {
		Random rm = new Random();
		int num1 = rm.nextInt(9);
		int num2 = rm.nextInt(9);
		System.out.println("What is " + num1 + " - " + num2 + " ?");
		Scanner sc = new Scanner(System.in);
		int ans = sc.nextInt();
		if (ans == num1 - num2) {
			System.out.println("Your answer is correct!");
		}
		else {
			System.out.println("Sorry this isnt correct");

		}

		
	}

}
