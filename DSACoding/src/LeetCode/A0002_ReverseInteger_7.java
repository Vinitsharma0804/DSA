/*
Written by          : Vinit Sharma
Dated               : 21/02/2025
Problem number 		: 7

Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 
Example 1:
Input: x = 123
Output: 321
Example 2:
Input: x = -123
Output: -321
Example 3:
Input: x = 120
Output: 21
 
Constraints:
•	-231 <= x <= 231 - 1

*/
package LeetCode;

public class A0002_ReverseInteger_7 {
	public static void main(String args[]) {
		int out = reverse(23);
		System.out.println(out);
		
	}
	public static int reverse(int x) {
        long revNum = 0;
        int digit = 0;
        
        while(x!=0){
            digit = x%10;
            revNum = (revNum*10) + digit;
            x = x/10;
        }
        if (revNum < Integer.MIN_VALUE || revNum > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int)revNum;
        }
    }

	
}
