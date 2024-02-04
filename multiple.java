package time;
import java.util.Scanner;
public class multiple {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter an integer:");

		int num = sc.nextInt();

		if (num % 3 == 0 && num % 5 == 0)

		System.out.println(num +" is a multiple of 3 & 5");

		else if(num % 3 == 0)

		System.out.println(num + " is a multiple of 3");

		else if(num % 5 == 0)

		System.out.println(num + " is a multiple of 5");

		else

		System.out.println(num + " is not divisible by 3 or 5");


}
}