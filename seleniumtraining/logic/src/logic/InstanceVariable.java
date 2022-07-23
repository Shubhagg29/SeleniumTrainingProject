package logic;

public class InstanceVariable {
	
	int roll;
	double marks;
	
	
	
	public InstanceVariable(int rollnumber ,double submarks) {
		this.roll=rollnumber;
		this.marks =submarks;
	}
	
	public static void main(String[] args) {
		
		InstanceVariable obj1= new InstanceVariable(70,90.6);
		obj1.show();
		
	}

	
	
	public void show () {
		System.out.println("The Roll number is:"+ roll + "  The marks for this:"+marks);
	}
}
