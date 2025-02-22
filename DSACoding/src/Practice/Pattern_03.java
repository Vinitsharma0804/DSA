/*

 *
 **
 ***
 ****
 *****
 ****
 ***
 **
 *

 */
package Practice;

import java.util.Scanner;

public class Pattern_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int userIn = sc.nextInt();
		for(int i=1; i<2*userIn; i++){
			int star = (i > userIn) ? (2 * userIn - i) : i;            
			System.out.println("");
			for(int j=1; j<=star; j++){
				System.out.print("*");
			}
		}
	}

}
