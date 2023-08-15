package learnJava;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("meow\n");
		System.out.println("more meow");
		
		int x;//declaration
		x = 25;//assignment
		int y = 34;//initialisation
		
		long z = 191342423434234L;
		
		System.out.println(x+" and "+y+" and "+z);
		
		//swapping numbers
		
		System.out.println("x is :"+x);
		System.out.println("y is :"+y);
	
		int temp;
		
		temp = x;
		x=y;
		y=temp;
		
		System.out.println("now x is :"+x);
		System.out.println("now y is :"+y);
		
		//taking input
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		System.out.println("give name");
		String name = scanner.nextLine();
		System.out.println("give age");
		int age = scanner.nextInt();
		scanner.nextLine();//prevents the next input from being skipped
		
		System.out.println("give names");
		String names = scanner.nextLine();
		
		System.out.println("Hello "+name);
		System.out.println("Hello "+age);
		System.out.println("Hello "+names);
		
		
	}

}
