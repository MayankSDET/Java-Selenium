package Java;

public class palindromeString {
	
	public static boolean  palindromemethod(String str) {
		
		var x = str.length();
		var rev = "";
		for(var i = x-1; i>=0; i--) {
			rev = rev + str.charAt(i);
		}
		return str.equalsIgnoreCase(rev);
	}
	
	public static void main(String[] args) {
		
		var str = "abba";
		if(palindromemethod(str)) {
			System.out.println("palindrome String");
		}else {
			System.out.println("not a palindrome String");
		}
	}
}
