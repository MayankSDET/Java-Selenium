package Java;

import java.util.HashMap;
import java.util.Map;

public class occuranceofCharacters {
	
	public static Map<String, Integer> occuranceCharacters(String str){
		Map<String, Integer> characterCount = new HashMap<>();
	    
	    for (char c : str.toCharArray()) {
	        String key = String.valueOf(c);
	        characterCount.put(key, characterCount.getOrDefault(key, 0) + 1);
	    }
	    return characterCount;
	}

	public static void main(String[] args) {

		String s = "Mayank Mani";
		System.out.println(occuranceCharacters(s));
	}
}


