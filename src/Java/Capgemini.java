package Java;

public class Capgemini {

	public static int[] findnumbers(int[] arr, int sum) {
		for(int i = 0; i<=arr.length-1; i++) {
			for(int j =i+1; j<=arr.length-1; j++) {
				if(arr[i]+arr[j]==sum) {
					System.out.println(arr[i]+ "and" + arr[j]);
					return new int[]{arr[i], arr[j]};
				}
			}
		}
		return null;

	}

	public static void main(String[] args) {
		int[] numbers = {-1, 10, 1, 2, 7, 4, 5, 6, 8, 9};
		int target = 11;

		int[] result = findnumbers(numbers, target);

		if (result != null) {
			System.out.println("Pair found: " + result[0] + ", " + result[1]);
		} else {
			System.out.println("No pair found");
		}
	}
}