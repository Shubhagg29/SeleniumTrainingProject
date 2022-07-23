package logic;

public class StringDemo {

	public static void main(String[] args) {
		
//		String fullName="Selenium-HP-QTP-Grid";
//		
//		String[] toolName=fullName.split("-");
//		System.out.println(toolName.length);
//		
//		for(int i=0;i<toolName.length;i++) {
//			System.out.println(toolName[i]);
//			
//			if(toolName[i].equalsIgnoreCase("HP")) {
//			
//				System.out.println("Test Passed");
//				
//				
//			}
//		}
		
		trimDemo();
	}
     public static void trimDemo() 
     {
	String name ="  Shubham   ";
	
    String m=	name.substring(1);
	String n=name.trim();	
	System.out.println(m);
	System.out.println(n);
	
    

}
	
	
}
