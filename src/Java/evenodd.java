package Java;

import java.util.Scanner;

public class evenodd {

	public static boolean evenOddNumber(int a) {
		if (a % 2 == 0) {
			System.out.println("It's an even number");
			return true;  // Correct return for even numbers
		} else {
			System.out.println("It's an odd number");
			return false; // Correct return for odd numbers
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = sc.nextInt();
		System.out.println("You have entered:" + num);
		boolean isEven = evenOddNumber(num);
		System.out.println("Return value: " + isEven);

	}

}
