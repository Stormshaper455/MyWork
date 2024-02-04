package time;
import java.util.Scanner;
import java.util.Random;
public class calculator {
	public static void multi() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Multiplication");

			System.out.println("What is your first number? ");
			int ansx = sc.nextInt();
			System.out.println("What is your second number? ");
			int ansx2 = sc.nextInt();
			int x = ansx * ansx2;
			System.out.println(x);

		}
	public static void add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Multiplication");

			System.out.println("What is your first number? ");
			int ansa = sc.nextInt();
			System.out.println("What is your second number? ");
			int ansa2 = sc.nextInt();
			int adda2 = ansa + ansa2;
			System.out.println(adda2);

		}
	public static void subtraction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Multiplication");

			System.out.println("What is your first number? ");
			int anss = sc.nextInt();
			System.out.println("What is your second number? ");
			int anss2 = sc.nextInt();
			int sub = anss - anss2;
			System.out.println(sub);

		}
	public static void divid() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Divide");

			System.out.println("What is your first number? ");
			int ansd = sc.nextInt();
			System.out.println("What is your second number? ");
			int ansd2 = sc.nextInt();
			int div = ansd / ansd2;
			System.out.println(div);

		}
	public static void squ() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Squared");

			System.out.println("What is your first number? ");
			int anss = sc.nextInt();
			System.out.println("What is your second number? ");
			int anss2 = sc.nextInt();
			int squr = anss * anss2;
			System.out.println(squr);

		}
	
	
	public static void main(String [] args) {
		boolean correct = false;

		Scanner sc = new Scanner(System.in);
		Random to = new Random();
		String choice []= { "multi -> x", "add -> +","sub -> -", "div -> /", "squar -> *"
				
		};
		
		System.out.println(choice[0]);
		System.out.println(choice[1]);
		System.out.println(choice[2]);
		System.out.println(choice[3]);
		System.out.println(choice[4]);

			while(correct == false) {
		String ans1 = sc.nextLine();
		switch(ans1) {

		case "+": 
			 correct = true;

			add();
			break;
		case "-": 
			 correct = true;

			subtraction();
		break;
		case "x": 
			 correct = true;

			multi();
		break;
		case "/":
			 correct = true;

			divid();
		break;
		case "*":
			 correct = true;

			squ ();
			break;
			default:
				System.out.println("Invalid try again");
				
		}
		}
	
		
	 
		
		
	}
	


}
