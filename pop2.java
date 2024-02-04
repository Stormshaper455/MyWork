package time;
import java.util.Scanner;

public class pop2 {
public static void main (String [] args ) {
	Scanner sc = new Scanner(System.in);
	
	int jo = sc.nextInt();
	if (jo <10) {
		System.out.println("test1");
		
	}
	else if(jo >10) {
		System.out.println("test2");

	}
	else if (jo == 10) {
		System.out.println("test3");
		jo++;

	}
	else {
		System.out.println("we done");

	}
	System.out.println(jo);
	int num = 1;
	

}
}
