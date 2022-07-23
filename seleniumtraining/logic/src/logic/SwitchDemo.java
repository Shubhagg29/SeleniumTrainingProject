package logic;

public class SwitchDemo {

	public static void main(String[] args) {

		String month = "mar";

		switch (month)

		{
		case "Jan":

			System.out.println(" Month is January");
		
		break;
		
		case"feb" :

			System.out.println(" Month is February");
			break;
			
			
		case "mar":

			System.out.println("Month is March");
			break;
			
		case "apr":

			System.out.println("Month is April");
			break;
			
			default:
				System.out.println("Month is Out of Calendar");		
	}

}
}