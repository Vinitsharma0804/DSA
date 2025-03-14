/*
Written by          : Vinit Sharma
Dated               : 14/03/2025

Recursion
Reverse an Array
Difficulty: Easy	Accuracy: 55.32%	Submissions: 141K+	Points: 2	Average Time: 5m
You are given an array of integers arr[]. Your task is to reverse the given array.

Note: Modify the array in place.

Examples:

Input: arr = [1, 4, 3, 2, 6, 5]
Output: [5, 6, 2, 3, 4, 1]
Explanation: The elements of the array are 1 4 3 2 6 5. After reversing the array, the first element goes to the last position, the second element goes to the second last position and so on. Hence, the answer is 5 6 2 3 4 1.
Input: arr = [4, 5, 2]
Output: [2, 5, 4]
Explanation: The elements of the array are 4 5 2. The reversed array will be 2 5 4.
Input: arr = [1]
Output: [1]
Explanation: The array has only single element, hence the reversed array is same as the original.
Constraints:
1<=arr.size()<=105
0<=arr[i]<=105
 */

package GeeksForGeek;

import java.util.Arrays;

public class A015_Recursion_ReverseArray {
	public static void main(String args[]) {
		int[] array = {1,5,3,8,9};
		reverseArray(array);
	}
    public static void reverseArray(int arr[]) {
    	int lIndex = 0;
        int rIndex = arr.length-1;
    }
    public static int[] swap(int rIndex, int lIndex, int[] array) {
    	if(lIndex >= rIndex) {
    		return array;
    	}
    	int tempVar = array[lIndex];
    	array[lIndex] = array[rIndex];
    	array[rIndex] = tempVar;
    	lIndex++;
    	rIndex--;
    	array = swap(rIndex, lIndex, array);
    	return array;
    }
}
