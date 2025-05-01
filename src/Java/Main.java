package Java;

import java.util.Scanner;

public class Main {
	public static boolean isEven(int num) {
		System.out.println(num + " is " + (num % 2 == 0 ? "even" : "odd"));
		return num % 2 == 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		boolean isEven = isEven(num);
		System.out.println("Return value: " + isEven);
	}
}
