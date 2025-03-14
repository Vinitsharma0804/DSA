/*
Written by          : Vinit Sharma
Dated               : 14/03/2025

Recursion
Print N to 1 without loop
Difficulty: Easy	Accuracy: 77.72%	Submissions: 107K+	Points: 2	Average Time: 10m
Print numbers from N to 1 (space separated) without the help of loops.

Example 1:

Input:
N = 10
Output: 10 9 8 7 6 5 4 3 2 1
Your Task:
This is a function problem. You only need to complete the function printNos() that takes N as parameter and prints number from N to 1 recursively. Don't print newline, it will be added by the driver code.


Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N) (Recursive).

Constraint
1<=n<=1000
*/
package GeeksForGeek;

public class A012_Recursion_Nto1 {
	public static void main(String args[]) {
		printNos(9);
	}
    public static void printNos(int n) {
        // Your code here
        if(n<1){
            return;
        }
        System.out.print(n + " ");
        printNos(n-1);
    }
}
