package constructorDemo;

public class ChildClass extends ParentClass {

	int rate = 10;

	public ChildClass() {
		System.out.println("I am Child Class constructor");
	}

	public ChildClass(String name) {

		super(name);

		System.out.println("I am Child Class constructor for " + name);
	}

	public static void main(String[] args) {

		ChildClass obj1 = new ChildClass("Shubham");

		obj1.findIntrestRate();

	}

	public void findIntrestRate() {

		System.out.println("Intrest rate of Child " + super.rate);

	}

}
