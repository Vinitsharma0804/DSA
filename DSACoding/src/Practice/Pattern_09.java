/* 
A 
B B 
C C C 
D D D D 
E E E E E
 */
package Practice;

import java.util.Scanner;

public class Pattern_09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int userIn = sc.nextInt();
        //int out = 1;
        char charOut = 'A';
        for(int i=1; i<=userIn; i++){
            System.out.println("");
            for(int j=1; j<=i; j++){
                    System.out.print(charOut + " ");
                }
            charOut ++;
            }
    }

}
