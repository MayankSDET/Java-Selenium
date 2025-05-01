package Collections;
import java.util.*;

public class Hashmap {
	public static void main(String[] args) {

		String s = "Programming";
		Map<Character, Integer> countMap = new HashMap<>();

		for (char c : s.toCharArray()) {
			countMap.put(c, countMap.getOrDefault(c, 0) + 1);           
			// Update count
		}

		System.out.println("Character Occurrences:");

		for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}


