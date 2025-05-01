package Collections;

public class reverseWords {
	
	public static void main(String[] args) {
		var str = "Mayank Mani";
		var a = 10; 
		//var str2 = "Mayank";
        String[] words = str.split(" "); // Split the string by space
        String reversedString = words[1] + " " + words[0]; // Swap the words
        System.out.println(reversedString); 
        
        int len = str.length();
        String rev= "";
        for(int i = len-1; i>=0; i--) {
        	 rev = rev + str.charAt(i);
        }
        System.out.println(rev);
        
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            StringBuilder reverseWord = new StringBuilder(word);
            sb.append(reverseWord.reverse()).append(" "); // Reverse each word
        }
        System.out.println(sb.toString().trim()); // Output: knayaM inaM
	}

}
