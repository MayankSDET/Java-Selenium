package Java;

public class reverseWords1 {
	
	public static void main(String[] args) {
		
		
		String str = "Mayank Mani";
		String[] words = str.split(" ");
		
		int x = words[0].length();
		String reverse1 = "";
		for(int i = x-1; i>=0; i--) {
			reverse1 =reverse1 + words[0].charAt(i); 
		}
		
		int y = words[1].length();
		String reverse2 = "";
		for(int i = y-1; i>=0; i--) {
			reverse2 =reverse2 + words[1].charAt(i); 
		}
		
		System.out.println(reverse1 +" " + reverse2);
		
	}

}
