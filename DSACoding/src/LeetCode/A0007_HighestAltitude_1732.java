/*
Written by          : Vinit Sharma
Dated               : 19/03/2025
Problem number 		: 1732

There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.
You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.

Example 1:

Input: gain = [-5,1,5,0,-7]
Output: 1
Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
Example 2:

Input: gain = [-4,-3,-2,-1,4,3,2]
Output: 0
Explanation: The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 0.
 
Constraints:

n == gain.length
1 <= n <= 100
-100 <= gain[i] <= 100
*/
package LeetCode;

public class A0007_HighestAltitude_1732 {
	public static void main(String args[]) {
		int[] array = {1,-7,3,8,-8};
		int out = largestAltitude(array);
		System.out.println(out);
	}
	public static int largestAltitude(int[] gain) {
        int tempVar = 0;
        int highestVar = 0;
        for(int i=0; i<gain.length; i++){
            tempVar += gain[i];
            if(tempVar > highestVar) highestVar = tempVar;
        }
        return highestVar;
    }
	
}
