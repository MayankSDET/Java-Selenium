package Java;

public class e2 {
	
	 public static int ReverseInt(int num)
	 {
	     int result = 0;
	     while (num > 0)
	     {
	         result = result * 10 + num % 10;
	         num /= 10;
	     }
	     return result;
	 }
	 
	 public static void main(String[] args) {
		System.out.println(ReverseInt(258));
	}

}
