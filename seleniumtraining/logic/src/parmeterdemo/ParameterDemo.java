package parmeterdemo;

public class ParameterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReturnDemo obj1 = new ReturnDemo();
		double sumresult = obj1.sum(10.3, 20.7);
		System.out.println("Value of operation " + sumresult);

		int result = obj1.sub(30, 20);
		System.out.println("Value of operation " + result);

	}

}
