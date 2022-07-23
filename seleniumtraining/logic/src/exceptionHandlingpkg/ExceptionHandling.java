package exceptionHandlingpkg;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int c = 10 / 0;
			System.out.println("the system result " + c);
			

		} catch (Exception e) {
			System.out.println("Went Wrong" +e.getMessage());
		}
		System.out.println("End the Prg");
	}

}
