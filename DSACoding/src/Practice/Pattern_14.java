/*

***** 
*   * 
*   * 
*   * 
*****

 */

package Practice;

import java.util.Scanner;

public class Pattern_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int userIn = sc.nextInt();
        for(int i=1; i<=userIn; i++){
            System.out.println(" ");
            for(int j=1; j<=userIn; j++){
                if(i==1 || i==userIn
                        || j==1 || j == userIn) 
                    System.out.print("*");
                else System.out.print(" ");
            } 
        }
    }

}
