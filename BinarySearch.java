/*
	Author: Alibek Aidarov
 */

public class BinarySearch {
	
	/**
	 * Uses binary searching algorithm to search for a value in an array
	 * @param sorted array in ascending order to search in. 
	 * @param value to search for
	 * @return index of value if found, else -1
	 */
	private static int binary_search(int[] array, int value) {
		int lo = 0;
		int mid = 0;
		int hi = array.length - 1;
		while(lo <= hi) {
			// find middle index
			mid = lo + (hi - lo)/2;
			if(array[mid] == value)
				return mid;
			else if(array[mid] > value)
				// if middle element is greater than value search on "left" side
				hi = mid - 1; 
			else 
				// if middle element is smaller than value search on "right" side
				lo = mid + 1;  
		}
		// not found
		return -1; 
	}

	public static void main(String[] args) {
		
		// Test Case 1
		int[] array1 = {4,5,6};
		int index1 = 1; 
		System.out.println("Testing BinarySearch functionality");
		
		if(binary_search(array1, 5) == index1) 
			printSuccess();
		else 
			printFail();

		// Test Case 2
		int[] array2 = {0};
		int index2 = 0;
		if(binary_search(array2, 0) == index2) 
			printSuccess();
		else 
			printFail();

		// Test Case 3
		int[] array3 = {1,2,3,4,5,6,7,8,9};
		int index3 = -1;
		if(binary_search(array3, 10) == index3) 
			printSuccess();
		else 
			printFail();

		// Test Case 4
		int[] array4 = {1,2,3,4,5,6};
		int index4 = 2; 
		if(binary_search(array4, 3) == index4) 
			printSuccess();
		else 
			printFail();

	}

	public static void printSuccess() {
		System.out.println("Success!");
	}
	public static void printFail() {
		System.out.println("Fail!");
	}
}
