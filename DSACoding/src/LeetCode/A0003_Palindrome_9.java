/*
Written by          : Vinit Sharma
Dated               : 22/02/2025
Problem number 		: 9

Given an integer x, return true if x is a 
palindrome, and false otherwise.

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 
Constraints:
-231 <= x <= 231 - 1
 */
package LeetCode;

public class A0003_Palindrome_9 {
	public static void main(String args[]) {
		boolean out = isPalindrome(23);
		System.out.println(out);
		
	}
	public static boolean isPalindrome(int x) {
        int userIn = x;
        long revNum = 0;
        int digit = 0;
        while(x>0){
            digit = x%10;
            revNum = (revNum * 10) + digit;
            x = x/10;
        }
        if(revNum == userIn)
            return true;
        else
            return false;
    }
}
