package logic;

import java.util.Scanner;

public class Learning {

	public static void main(String[] args) {
		
		factNumber();
		
		Learning obj1= new Learning();
		obj1.reverseString();
		FirstDemo.print();
	}

	public static void factNumber() {

		int i, fact = 1;

		int number = 6;

		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + number + " is: " + fact);
	}

	public void reverseString() {

		// By Reverse Iteration
		
	
		String initial, rev = "";

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string to reverse");
		initial = scanner.nextLine();
		int length = initial.length();{
		for (int i = length - 1; i >= 0; i--)
			rev = rev + initial.charAt(i);
		System.out.println("Reversed string: " + rev);
		
		}
		// By String Builder
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the string to reverse by String Builder");
		String input=scan.nextLine();
		StringBuilder obj1 = new StringBuilder();

		obj1.append(input);
		StringBuilder Re = obj1.reverse();

		System.out.println("String is " + Re);

	}
	
}

