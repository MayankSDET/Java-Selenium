package Collections;

import java.util.ArrayList;

public class ArrayList2 {
	
	public static void main(String[] args) {
		
		 var intlist = new ArrayList<Integer>();
		 
		 intlist.add(10);
		 intlist.add(20);
		 
		 for(int i =0; i<intlist.size(); i++) {
				System.out.println(intlist.get(i));
			}
		 for(var s: intlist) {
				System.out.println(s);
			}
		 
		 var stringlist = new ArrayList<String>();
		
		
	}

}
