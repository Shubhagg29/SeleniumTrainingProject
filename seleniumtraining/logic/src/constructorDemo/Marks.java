package constructorDemo;



public class Marks {
	
	
	int result;

	public static void main(String[] args) {

		Marks mt = new Marks(70);
		mt.displayResult();

	}

	public Marks(int marks) {

		result =marks;
		//System.out.println("Total marks " +marks);

	}

	
	public void displayResult() {
		System.out.println("The Result are out now "  +result);
		//System.out.println("Total marks " +marks);
	}

}
