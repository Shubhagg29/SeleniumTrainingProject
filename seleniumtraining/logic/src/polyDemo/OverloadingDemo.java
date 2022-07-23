package polyDemo;

public class OverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	
	
	public void add(int a, int b) {

		int c = a + b;
		System.out.println("Sum of numbers " + c);

	}
	public void add(int a, int b, int d) {

		int c = a + b+d;
		System.out.println("Sum of numbers " + c);

	}
	public void add(double a, double b, double d) {

		double c = a + b+d;
		System.out.println("Sum of numbers " + c);

	}
	
	
		
		
		
	
}
