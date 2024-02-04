package time;

public class timeconvert {
	public static void main(String [] args) {
		
		System.out.println("Input total number of seconds");
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int seconds = input.nextInt();
		int min = seconds/60;
		seconds = seconds - min*60;
		int hour = min/60;
		min = min - hour * 60;
		
		System.out.print(hour + " Hour " + min + " min " + seconds + " seconds");
		
		
	}

}
