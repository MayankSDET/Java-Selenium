package Java;


public class reverseString {

	public static void main(String[] args) {

		// reverse a string
		String Str = "Hello World";
		String reverese = "";
		int len = Str.length();

		for(int i= len-1; i>=0; i--) {
			reverese = reverese +Str.charAt(i);
		}
		System.out.println(reverese);

		//reverse the words
		String[] words = Str.split(" ");
		StringBuilder output = new StringBuilder();
		for(int i = words.length - 1; i >= 0; i--) { // Using words.length
			output.append(words[i]).append(" "); // Append words correctly
		}

		System.out.println(output.toString().trim());

		for (String word : words) {
			output.append(new StringBuilder(word).reverse()).append(" ");

		}
		System.out.println(output.toString().trim());
		System.out.println("###################################################");
		System.out.println(reversemethod("Hello Selenium"));
		System.out.println("###################################################");
		System.out.println(reverseWords("Hello Selenium"));
	}

	public static String reversemethod(String str) {

		var reverse = "";
		var x = str.length();
		for(int i =x-1; i>=0; i--) {
			reverse = reverse + str.charAt(i);
		}

		return reverse;

	}
	public static String reverseWords(String str) {
		String[] words = str.split(" ");
		StringBuilder output = new StringBuilder();
		for(int i = words.length - 1; i >= 0; i--) { // Using words.length
			output.append(words[i]).append(" "); // Append words correctly
		}
		return output.toString().trim();
	}


}
