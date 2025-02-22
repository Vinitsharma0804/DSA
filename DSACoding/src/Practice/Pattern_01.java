/*
    *    
   ***   
  *****  
 ******* 
*********

 */

package Practice;

import java.util.Scanner;

public class Pattern_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int userIn = sc.nextInt();
        for(int i=0; i<userIn; i++){
            System.out.println("");
            for(int j=1; j<=userIn-i-1; j++){
                    System.out.print(" ");
                }
            for(int j=1; j<=2*i+1; j++){
                    System.out.print("*");
                }
            for(int j=1; j<=userIn-i-1; j++){
                    System.out.print(" ");
                }
            }
    }

}
