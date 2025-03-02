/*
Written by          : Vinit Sharma
Dated               : 02/03/2025

Sum 1 to n Divisors
Difficulty: Easy	Accuracy: 43.37%	Submissions: 205K+	Points: 2
Given a positive integer n, The task is to find the value of Σi F(i) where i is from 1 to n and function F(i) is defined as the sum of all divisors of i.

Examples:

Input: n = 4
Output: 15
Explanation:
F(1) = 1
F(2) = 1 + 2 = 3
F(3) = 1 + 3 = 4
F(4) = 1 + 2 + 4 = 7
So, F(1) + F(2) + F(3) + F(4)
    = 1 + 3 + 4 + 7 = 15
Input: n = 5
Output: 21
Explanation:
F(1) = 1
F(2) = 1 + 2 = 3
F(3) = 1 + 3 = 4
F(4) = 1 + 2 + 4 = 7
F(5) = 1 + 5 = 6
So,  F(1) + F(2) + F(3) + F(4) + F(5)
    = 1 + 3 + 4 + 7 + 6 = 21
Input: n = 1
Output: 1
Explanation:
F(1) = 1
So,  F(1) = 1 
Constraints:
1 <= n <= 105

 */

package GeeksForGeek;

public class A007_oneToNDivisor {
	public static void main(String args[]) {
		int out = sumOfDivisors(4);
		System.out.println(out);
		
	}
	public static int sumOfDivisors(int n) {
        // code here
        int outTotal = 0;
        int count = 1;
        while(count<=n){
            for(int i = 1; i*i <= count; i++){
                if(count%i == 0){
                    outTotal += i;
                    if(count/i != i){
                        outTotal += count/i;
                    }
                }
            }
            count++;
        }
        return outTotal;
    }
}
