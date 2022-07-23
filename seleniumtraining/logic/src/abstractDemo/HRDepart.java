package abstractDemo;

import java.util.ArrayList;

public class HRDepart extends ITDepart {

	public static void main(String[] args) {

		HRDepart hr = new HRDepart();

		hr.goodies();
		hr.work();
		hr.salary();

		ITDepart it = new HRDepart();
		it.salary();
		it.work();

	}

	
	
	public void salary() {
		System.out.println("Salary 15LPA");

	}

}
