/*
A B C D E 
A B C D 
A B C 
A B 
A
 */
package Practice;

import java.util.Scanner;

public class Pattern_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int userIn = sc.nextInt();
        int out = 1;
        for(int i=1; i<=userIn; i++){
            System.out.println("");
            for(char j='A'; j<='A'+(userIn-i); j++){
                    System.out.print(j + " ");
                }
            }
    }

}
