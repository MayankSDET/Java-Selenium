package Java;

public class sumofarray {
	
	public static Integer sum(int[] arr) {
		   if (arr == null || arr.length == 0) {
		        return 0; // Return 0 for empty or null arrays
		    }
		    
		    int sum = 0;
		    for (int num : arr) {
		        sum += num;
		    }
		    
		    return sum;
		}
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8 ,9};
		System.out.println(sum(arr));
		
	}

}
