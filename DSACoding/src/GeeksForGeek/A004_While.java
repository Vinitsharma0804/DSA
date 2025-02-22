/*

Written by			: Vinit Sharma
Dated 				: 14-02-2025
Problem number 		:

While loop is another loop like for loop but unlike for loop it only checks for one condition.
Here, we will use a while loop and print a number n's table in reverse order.
Examples:
Input: n = 1
Output: 10 9 8 7 6 5 4 3 2 1
Input: n = 2
Output: 20 18 16 14 12 10 8 6 4 2
Constraints:
1 <= n<= 1000

 */
package GeeksForGeek;

import java.util.Scanner;

public class A004_While {
	public static void main(String args[]) {
        // Your Code Here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 10;
        while (i > 0) {
            int mul = i * n;
            System.out.print(mul + " ");
            i -= 1; 
        }
        scanner.close();
    }

}
