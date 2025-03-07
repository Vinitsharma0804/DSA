/*
Written by          : Vinit Sharma
Dated               : 02/03/2025

Minimum Jumps
Difficulty: Medium	Accuracy: 11.91%	Submissions: 958K+	Points: 4
You are given an array arr[] of non-negative numbers. Each number tells you the maximum number of steps you can jump forward from that position.

For example:

If arr[i] = 3, you can jump 1 step, 2 steps, or 3 steps forward from position i.
If arr[i] = 0, you cannot jump forward from that position.
Your task is to find the minimum number of jumps needed to move from the first position in the array to the last position.

Note:  Return -1 if you can't reach the end of the array.

Examples : 

Input: arr[] = [1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9]
Output: 3 
Explanation: First jump from 1st element to 2nd element with value 3. From here we jump to 5th element with value 9, and from here we will jump to the last. 
Input: arr = [1, 4, 3, 2, 6, 7]
Output: 2 
Explanation: First we jump from the 1st to 2nd element and then jump to the last element.
Input: arr = [0, 10, 20]
Output: -1
Explanation: We cannot go anywhere from the 1st element.
Constraints:
2 ≤ arr.size() ≤ 106
0 ≤ arr[i] ≤ 105
 */

package GeeksForGeek;

public class A008_MinimumJumps {
	public static void main(String args[]) {
		//9, 10, 1, 2, 3, 4, 8, 0, 0, 0, 0, 0, 0, 0, 1
		//1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9
		int[] array = {9, 10, 1, 2, 3, 4, 8, 0, 0, 0, 0, 0, 0, 0, 1};
		int out = minJumps(array);
		System.out.println(out);
		
	}
	public static int minJumps(int[] arr) {
		int arrSize = arr.length;
		int jumps = 1;
		if (arrSize == 1) return 0; 
	    if (arr[0] == 0) return -1; 
	    //maxReach = Math.max(arrSize, arr[0]);
	    int maxReach = arr[0];
	    int stepEnd = arr[0];
	    for(int i = 1; i<arrSize; i++){
	    	if (i == arrSize - 1) return jumps;
	    	maxReach = Math.max(maxReach, i+arr[i]);
	    	if(i == stepEnd) {
	    		jumps++;
	    		stepEnd = maxReach;
	    		if(stepEnd >= arrSize-1) return jumps;
	    	}
	    	if(i >= maxReach) return -1;
	    }
	    return jumps;
    }
}
