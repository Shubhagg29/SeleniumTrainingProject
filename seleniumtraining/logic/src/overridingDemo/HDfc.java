package overridingDemo;

public class HDfc extends RBI
{

	private String name;
    private int age;

	public HDfc(String name ,int age) {
		this.name= name;
		this.age = age;
		System.out.println("Interest Rate " + name);
	}
	public static void main(String[] args) {
		
		HDfc hdfc  = new HDfc("shubham", 20);

		hdfc.homeLoanIntrestRate();
		
		RBI hdfc1  = new RBI();
		
		hdfc1.homeLoanIntrestRate();
	}
	
	
	public void homeLoanIntrestRate(String name, int age) {

		System.out.println("HDFC home loan intrest rate HDFC  8%");

	}


}
