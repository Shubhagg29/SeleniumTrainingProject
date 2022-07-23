package collectionpkg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class SetDemo {

	public static void main(String[] args) {
		

		LinkedHashSet<String> set = new LinkedHashSet<>();
		set.add("Selenium");
		set.add("Wini");
		set.add("pooh");
		set.add("1");
		set.add("random");
		set.add("random");
		System.out.println("The " +set);
	
	
		
		for(String values:set) {
			System.out.println("The Values in HashSet " + values);
			
			
		}

		
		List<String>list =new ArrayList<String>(set);
	    System.out.println(list.get(0));	
		
		
		

	}

}
