/*

*        * 
**      ** 
***    *** 
****  **** 
********** 
****  **** 
***    *** 
**      ** 
*        *

 */
package Practice;

import java.util.Scanner;

public class Pattern_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int userIn = sc.nextInt();
        int stars, spaces=0;
        for(int i=1; i<=2*userIn-1; i++){
            System.out.println(" ");
            stars = (i <= userIn) ? i : (2*userIn-i);
            spaces = (i <= userIn) ? 2*(userIn-i) : 2*(i-userIn);
            for(int j=1; j<=stars; j++){
                System.out.print("*");
            } 
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            } 
            for(int j=1; j<=stars; j++){
                System.out.print("*");
            } 
        }
    }

}
