package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
	
	public static void main(String[] args) {
		
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Mayank");
		ar.add("Nandini");
		
		//Iterator in Arraylist
		//Using loop
		for(int i =0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		// using for loop
		for(String s: ar) {
			System.out.println(s);
		}
		
		//JDK 8 - Lambda Functions
		ar.stream().forEach(ele -> System.out.println(ele));
		
		//using Iterator
		Iterator<String> it = ar.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
			
			
	}

}
