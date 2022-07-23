package keywordPkg;

public class MyDriver {


	
	public MyDriver() {
		this("HDBC");
		System.out.println("Loading my drivers");
		
	}
	
	public MyDriver(String name) {
		
		this(10);
		
		System.out.println("Loading my drivers- Name " +name);
		
	}
	
	
	public MyDriver(int count) {
		
		System.out.println("Loading my drivers - Count " +count);
		
	}

	public static void main(String[] args) {
		
		MyDriver obj1= new MyDriver();
		
		

	}

}
