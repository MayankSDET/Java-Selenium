package Java;
public class Example {
	public static void main(String[] args) {
		
		var str = "Hello Mayank";
		String[] words = str.split(" ");
		
		int y = words[0].length();
        String reverse = "";
		
		for (int i = y - 1; i >= 0; i--) {
            reverse = reverse + words[0].charAt(i);
        }
		
		int x = words[1].length();
        String reverse1 = "";
		
		for (int i = x - 1; i >= 0; i--) {
            reverse1 = reverse1 + words[1].charAt(i);
        }
		System.out.println(reverse+" "+ reverse1);
		
	}
}