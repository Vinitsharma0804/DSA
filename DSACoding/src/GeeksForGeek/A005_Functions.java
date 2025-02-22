/*
Written by			: Vinit Sharma
Dated 				: 14-02-2025
Problem number 		:

Geek is learning about functions and calling a function with arguments. He learns that passing can take one of two forms: pass by value or pass by reference.
Geek wishes to add 1 and 2, respectively, to the parameter passed by value and reference. Help Geek in fulfilling his goal.
Example 1:
Input:
a = 1
b = 2
Output:
2 4
Explanation: 1 was passed by value whereas 2 passed by reference.
Example 2:
Input:
a = 10
b = 20
Output: 11 22
Explanation: 10 was passed by value whereas 20 passed by reference.
Constraints:
1 <= a,b <= 105
Your Task:
You don't need to read input or print anything. Your task is to complete the function passedBy() which takes a and b as input parameters and returns array of two required integers.

 */
package GeeksForGeek;

public class A005_Functions {

	public static void main(String args[]) {
		int[] out = passedBy(1,3);
		for(int i = 0; i<out.length; i++) {
			System.out.println(out[i]);
		}
	}
	static int[] passedBy(int a, int b) {
        // code here
        int[] arr = new int[2];
        arr[0] = a + 1;
        arr[1] = b + 2;
        return arr;
    }
	
}
