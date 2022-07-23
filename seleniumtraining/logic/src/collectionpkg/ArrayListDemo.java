package collectionpkg;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Object> ar = new ArrayList<Object>();
		
		
		ar.add("Ramesh");
		ar.add(123);
		ar.add(358235);
		ar.add(123.33);
		
		System.out.println(ar);
		
		
		//For Loop
		for(int i=0;i<ar.size();i++) {
			System.out.println("THE VALUES ARE " +ar.get(i));
			
		}
		//forEach Loop
		for(Object sr : ar) {
			
			System.out.println("Enhanced Values  " +sr);
			
		}
		
        //Iterator
		
		Iterator it = ar.iterator();
		
		while(it.hasNext()) {
			
			Object Value=it.next();
			System.out.println("Iterator values "+Value);
			
		}
		
		//Second Example
		
		
		
	}

	
	
	
}
