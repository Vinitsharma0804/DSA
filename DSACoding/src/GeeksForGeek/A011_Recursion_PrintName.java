/*
Written by          : Vinit Sharma
Dated               : 14/03/2025

Recursion
Print GFG n times
Difficulty: Easy	Accuracy: 75.76%	Submissions: 111K+	Points: 2	Average Time: 10m
Print GFG n times without the loop.

Example:

Input:
5
Output:
GFG GFG GFG GFG GFG
Your Task:
This is a function problem. You only need to complete the function printGfg() that takes N as parameter and prints N times GFG recursively. Don't print newline, it will be added by the driver code.


Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N) (Recursive).

Constraint:
1<=N<=1000
*/
package GeeksForGeek;

public class A011_Recursion_PrintName {
	public static void main(String args[]) {
		printGfg(4);
	}
	public static void printGfg(int N) {
        if(N<1){
            return;
        }
        System.out.print("GFG ");
        printGfg(N-1);
    }
}
