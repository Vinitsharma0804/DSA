/*
Written by          : Vinit Sharma
Dated               : 22/02/2025
Problem number 		: 125

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.
Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.

Constraints:
1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.

 */
package LeetCode;

public class A0005_Recursion_Palindrome_125 {
	public static void main(String args[]) {
		boolean out = isPalindrome("madam a");
		System.out.println(out);

	}
	static boolean out = true;
	public static boolean isPalindrome(String s) {

		String stringIn = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); 
		int startIndex = 0; 
		int endIndex = stringIn.length()-1; 
		out = checkPalindrome(stringIn, startIndex, endIndex); 
		return out;

		// OR
		
		/*String stringIn = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); 
		int strLength = stringIn.length()-1;
		for(int i = 0; i<=stringIn.length(); i++) {
			if(i>=strLength-i) return true;
			if(stringIn.charAt(i) != stringIn.charAt(strLength-i)) {
				out = false;
				return out;
			}
		}
		return true;*/
	}
	public static boolean checkPalindrome(String stringIn, int startIndex, int endIndex) {
		if(startIndex >= endIndex) {
			out = true;
			return out;
		}
		System.out.println(stringIn + " " + startIndex + " " + endIndex);
		if(stringIn.charAt(startIndex) != stringIn.charAt(endIndex)) {
			out = false;
			return out;
		}
		startIndex++;
		endIndex--;
		checkPalindrome(stringIn, startIndex, endIndex);
		return out;
	}

}
