package keywordPkg;

public class Variable {

 int x ;
 int y;
	
	public Variable(int x,int b) {
		this.x=x;
		y=b;		
		
	}
public void sum() {
	int z = x+y;
	System.out.println(z);
	
}
	
	
	public static void main(String[] args) {
		
		Variable obj1= new Variable(50,60);
		obj1.sum();
		
		
		

	}

}
