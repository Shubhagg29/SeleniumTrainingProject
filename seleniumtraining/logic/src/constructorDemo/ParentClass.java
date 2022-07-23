package constructorDemo;

public class ParentClass {
	
	
	int rate =8;
	
	
	public ParentClass() {
		
		System.out.println("I am in Parent Class constructor");
		
	}
	
public ParentClass(String name) {
		
		System.out.println("I am in Parent Class constructor for " +name);
		
	}
	public void findIntrestRate() {
		System.out.println("Intrest rate is " +rate);
	}

}
