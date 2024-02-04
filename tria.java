package time;
import java.util.Scanner;

public class tria {


	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the length of the first edge: ");
	        double edge1 = sc.nextDouble();

	        System.out.print("Enter the length of the second edge: ");
	        double edge2 = sc.nextDouble();

	        System.out.print("Enter the length of the third edge: ");
	        double edge3 = sc.nextDouble();

	        if (edge1 + edge2 > edge3 && edge1 + edge3 > edge2 && edge2 + edge3 > edge1) {
	            double perimeter = edge1 + edge2 + edge3;
	            System.out.println("Perimeter of the triangle is: " + perimeter);
	        } else {
	            System.out.println("Invalid input. The given sides do not form a valid triangle.");
	        }

	    }
	}

