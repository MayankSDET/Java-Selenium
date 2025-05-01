package Collections;

import java.util.Iterator;

public class Example3 {
	
	public static void main(String[] args) {
		
		var str = "Mayank Mani";
		char[] ch = str.toCharArray();
		for (char c : ch) {
           if(c>=2) {
        	   System.out.println(c);
           }
		
	}
	}
}
