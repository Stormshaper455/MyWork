package time;
import java.util.Scanner;
public class Paint {
	public static void main(String [] arg) {
	    Scanner input = new Scanner(System.in);

        System.out.print("Length of the room: ");
        double length = input.nextDouble();
        System.out.print("Width of the room: ");
        double width = input.nextDouble();
        System.out.print("Height of the room: ");
        double height = input.nextDouble();

        System.out.print("# windows: ");
        int Windows = input.nextInt();
        System.out.print("# doors: ");
        int numDoors = input.nextInt();

         int Gallon = 350;
         int Window = 15;
         int Door = 21;

        double roomArea = 2 * length * width + 2 * length * height + 2 * width * height;
        double windowsArea = Windows * Window;
        double doorsArea = numDoors * Door;
        double totalPaintArea = roomArea - windowsArea - doorsArea;

        int gallonsNeeded = (int) (totalPaintArea / Gallon);
        double remainingSquareFeet = totalPaintArea % Gallon;
        double quartsNeeded = remainingSquareFeet / (Gallon / 4.0);

        System.out.println(gallonsNeeded + " gallons and " + quartsNeeded + " quarts of paint needed for the room.");

        
    }
}