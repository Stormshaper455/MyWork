package time;

public class Case {
public static void main (String [] args) {
	String day = "Batman";
	
	switch(day) {
		case"Sunday": System.out.print("Its Sunday");
		break;
		case"Friday": System.out.print("Its Friday");
		break;// the breaks make it so it prints the right code
		case"Saturday": System.out.print("Its Saturday");
		break;
default: System.out.println("Thats not a day");
		
		
	}
}
}
