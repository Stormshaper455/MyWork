package time;
import java.util.*;

public class DriveCost {
	 public static void main(String[] args) {
		 
	        Scanner in = new Scanner(System.in);
	        
	        System.out.print("Enter the driving distance: ");
	        
	        double Distance = in.nextDouble();
	        
	        System.out.print("Enter miles per gallon: ");
	        
	        double Mpg = in.nextDouble();
	        
	        System.out.print("Enter price per gallon: ");
	        
	        double Ppg = in.nextDouble();
	        
	        System.out.printf("The cost of driving is $%.2f\n", (Distance / Mpg) * Ppg);
}
}