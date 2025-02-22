/*
A 
A B 
A B C 
A B C D 
A B C D E
 */
package Practice;

import java.util.Scanner;

public class Pattern_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int userIn = sc.nextInt();
        int out = 1;
        for(int i=0; i<userIn; i++){
            System.out.println("");
            for(char j='A'; j<='A' + i; j++){
                    System.out.print(j + " ");
                    out ++;
                }
            }
    }

}
