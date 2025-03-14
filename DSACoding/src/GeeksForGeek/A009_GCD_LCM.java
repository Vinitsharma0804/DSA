/*
Written by          : Vinit Sharma
Dated               : 08/03/2025

LCM And GCD
Difficulty: BasicAccuracy: 37.02%Submissions: 203K+Points: 1
Given two integers a and b, write a function lcmAndGcd() to compute their LCM and GCD. The function inputs two integers a and b and returns a list containing their LCM and GCD.

Examples:

Input: a = 5 , b = 10
Output: [10, 5]
Explanation: LCM of 5 and 10 is 10, while their GCD is 5.
Input: a = 14 , b = 8
Output: [56, 2]
Explanation: LCM of 14 and 8 is 56, while their GCD is 2.
Input: a = 1 , b = 1
Output: [1, 1]
Explanation: LCM of 1 and 1 is 1, while their GCD is 1.
Expected Time Complexity: O(log(min(a, b))
Expected Auxiliary Space: O(1)

Constraints:
1 <= a, b <= 109

*/

package GeeksForGeek;

public class A009_GCD_LCM {
	public static void main(String args[]) {
		int[] out = lcmAndGcd(9, 12);
		System.out.println(out);
	}
    public static int[] lcmAndGcd(int a, int b) {
        // code here
    	int gcd, lcm, n1 = a, n2 = b;
    	while(a!=0 && b!=0) {
    		if(a>b) a=a%b;
    		else b=b%a;
    	}
    	gcd= a>b? a:b;
    	lcm=(n1*n2)/gcd;
    	int[] array = new int[]{lcm, gcd}; 
    	return array;    	
    }
}
