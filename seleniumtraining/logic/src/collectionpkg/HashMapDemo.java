package collectionpkg;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		

		HashMap<String, String>map =new HashMap<String, String>();
		map.put("200", "Ramesh");
		map.put("400", "QTOP");
		map.put("300", "Mak");
		map.put("500", "Talk");
		map.put("600", "clock");
		System.out.println(map);
		
		map.get("700");
		
		
		
		for(Map.Entry<String, String> entry : map.entrySet()) {
			
			 String key = entry.getKey();
		   String value = entry.getValue();
		   System.out.println("the Keys for the Map are " + key);

		   System.out.println("the Keys for the Map are " + value); 
		    
		}

		
		
	}

}
