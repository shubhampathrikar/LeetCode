/*
Given an array nums of integers, return how many of them contain an even number of digits.

Example:
Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.
 */

public class EvenNumberDigits {

	public int findNumbers(int[] nums) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {

			if (digitsCount(nums[i]) % 2 == 0) {
				result++;
			}
		}
		return result;
	}

	private static int digitsCount(int n) {
		int count = 0;

		if (n == 0) {
			return 1;
		}
		while (n > 0) {
			n = n / 10;
			count++;
		}
		return count;
	}
}
