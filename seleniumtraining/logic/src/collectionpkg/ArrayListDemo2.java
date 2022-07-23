package collectionpkg;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<String> arraylist = new ArrayList<String>();	
		
		ArrayList<String> arraylist2 = new ArrayList<String>();	
		arraylist.add("Shubham");
		arraylist.add("Gupta");
		arraylist.add("123");
		
		
		for (int i=0;i<arraylist.size();i++) {
			
			
			
		}
		arraylist2.addAll(arraylist);	
		System.out.println(arraylist2);
	}

}
