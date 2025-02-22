/*
Written by			: Vinit Sharma
Dated 				: 14-02-2025
Problem number  	: 

Given two integers, n and m. The task is to check the relation between n and m. Return "lesser" if n < m,  "equal" if n == m, and "greater" if n > m.
Examples :

Input: n = 4, m = 8
Output: lesser
Explanation: 4 < 8 so print 'lesser'.
Input: n = 8, m = 8
Output: equal
Explanation: 8 = 8 so print 'equal'.
Input: n = 8, m = 4
Output: greater
Explanation: 8 > 4 so print 'greater'.
Constraints:
-109 <= m , n <= 109

 */
package GeeksForGeek;

public class A002_IfElse {
	public static void main(String[] args) {
		String out = compareNM(7, 3);
		System.out.println(out);
	}
	public static String compareNM(int n, int m) {
        // code here
        if (n > m){
            return "greater";
        }else if (n == m) {
            return "equal";
        }else {
            return "lesser";
        }
    }


}
