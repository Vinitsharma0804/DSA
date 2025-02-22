/*

********** 
****  **** 
***    *** 
**      ** 
*        * 
*        * 
**      ** 
***    *** 
****  **** 
**********

 */

package Practice;

import java.util.Scanner;

public class Pattern_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int userIn = sc.nextInt();
        
        for(int i=0; i<userIn; i++){
            System.out.println(" ");
            for(int j=1; j<=userIn-i; j++){
                System.out.print("*");
            } 
            for(int j=1; j<=2*i; j++){
                System.out.print(" ");
            } 
            for(int j=1; j<=userIn-i; j++){
                System.out.print("*");
            } 
        }
        for(int i=0; i<userIn; i++){
            System.out.println(" ");
            for(int j=1; j<=i+1; j++){
                System.out.print("*");
            } 
            for(int j=1; j<=2*(userIn-(i+1)); j++){
                System.out.print(" ");
            } 
            for(int j=1; j<=i+1; j++){
                System.out.print("*");
            } 
        }
    }

}
