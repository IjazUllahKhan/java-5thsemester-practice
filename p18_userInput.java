package practice;
import java.util.Scanner;

public class p18_userInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is you Name:");
		String name = sc.nextLine();
		System.out.println("Welcome "+name);

	}

}
