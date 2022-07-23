package inherritance;



public class Child extends BaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BaseTest obj2= new BaseTest();//This will access base class methods
		
		obj2.add();
		obj2.mul();
		
		
		Child obj1= new Child();// This will access Child class method and Base class methods
		
		obj1.mul();
		obj1.add();
		
		
		BaseTest obj3= new Child();//Reference of base class and object of child class will access child class methods
		obj3.add();
		obj3.mul();
		
		
		
			}


public void mul() {
		
		System.out.println("Multiplication of numbers is 2000");
		
	}


public void div() {
	
	System.out.println("Division of numbers is 50");
	
}


}
