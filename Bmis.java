package time;
import java.util.Scanner;
public class Bmis {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("what is your height in meters?");

		
		double height = sc.nextDouble();
		System.out.println("what is your weight in kilos?");
		double weight = sc.nextDouble();
	
		double BMI = weight / (height * height);
		System.out.println("Your BMI is " + BMI);
		
		if(BMI < 18.5) {
			System.out.println("Your Underweight");
			

		}
		else if(BMI < 25.0) {
			System.out.println("Your Normal");

		}
		else if (BMI < 30.0) {
			System.out.println("Your Overweight");

		}
		else  {
			System.out.println("Your Obese");

		}
		

	}

}
