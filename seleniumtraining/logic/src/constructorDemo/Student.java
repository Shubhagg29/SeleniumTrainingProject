package constructorDemo;

import java.sql.Array;

public class Student {

	public static void main(String[] args) {

		Student st = new Student(10);
		
		st.displayResult();

	}

	public Student() {

		System.out.println("Welcome to school ");

	}

	public Student(String schoolName) {

		System.out.println("Welcome to "+ schoolName +" school");

	}

	
	public Student(int bus) {

		System.out.println("Welcome to bus number " + bus);

	}

	public void displayResult() {
		System.out.println("The Result are out now ");
	}

}
