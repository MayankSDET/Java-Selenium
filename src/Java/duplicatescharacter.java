package Java;

import java.util.HashSet;

public class duplicatescharacter {
	
	public static HashSet<Character> findDuplicates(String str) {
		
		char[] ch = str.toCharArray();
		HashSet<Character> seen = new HashSet<>();
		HashSet<Character> duplicates = new HashSet<>();
		for (int i = 0; i < ch.length; i++) {
			if (seen.contains(ch[i])) {
				duplicates.add(ch[i]); // Store duplicates to print only once
			} else {
				seen.add(ch[i]);
			}
		}

		return duplicates;
		
	}

	public static void main(String[] args) {

		var str = "Mayank Mani";
		char[] ch = str.toCharArray();
		HashSet<Character> seen = new HashSet<>();
		HashSet<Character> duplicates = new HashSet<>();
		for (int i = 0; i < ch.length; i++) {
			if (seen.contains(ch[i])) {
				duplicates.add(ch[i]); // Store duplicates to print only once
			} else {
				seen.add(ch[i]);
			}
		}

		// Print duplicate characters
		System.out.println("Duplicate characters:");
		for (char c : duplicates) {
			System.out.println(c);
		}

	}
}