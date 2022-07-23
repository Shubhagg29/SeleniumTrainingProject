package logic;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		factNumber();
		reverseString();	
		
	}

	public static void factNumber() {

		int fact =1;
		int number =6;
		
		for (int i=1;i<number;i++) {
			fact = fact*i;
			
		}
		
		System.out.println(fact);
	}

	public static void reverseString() {

		// By Reverse Iteration
	String Str="";
	String Str1="";
	String reverse="";
	Scanner scan = new Scanner(System.in);
	System.out.println("PLease Enter string to reverse ");
	Str=scan.nextLine();
	for(int i=Str.length()-1;i>=0;i--)
	{
		reverse= reverse+	Str.charAt(i);
	}
	System.out.println(" Reversed String " +reverse);
	
	//By String Builder

	System.out.println("Please Enter string for Builder  ");
	Str1=scan.nextLine();
	StringBuilder obj1 = new StringBuilder();	
	
	obj1.append(Str1);
	
	StringBuilder newStr=obj1.reverse();
	
	System.out.println("Reversed string:Builder " + newStr);
	
	}

}
