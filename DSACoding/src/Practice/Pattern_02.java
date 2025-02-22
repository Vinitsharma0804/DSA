/*
*********
 ******* 
  *****  
   ***   
    *
 */
package Practice;

import java.util.Scanner;

public class Pattern_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int userIn = sc.nextInt();
        int midVar = (int)Math.ceil(userIn / 2.0);
        System.out.println(midVar);
        for(int i=0; i<userIn; i++){
            System.out.println("");
            for(int j=1; j<=i; j++){
                    System.out.print(" ");
                }
            for(int j=1; j<=2*(userIn-i)-1; j++){
                    System.out.print("*");
                }
            for(int j=1; j<=i; j++){
                    System.out.print(" ");
                }

        }
    }

}
