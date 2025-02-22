/*
E 
DE 
CDE 
BCDE 
ABCDE

 */
package Practice;

import java.util.Scanner;

public class Pattern_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int userIn = sc.nextInt();
        
        for(int i=1; i<=userIn; i++){
            char charOut = (char)('A'+ userIn-1);
            System.out.println(" ");
            for(char j=(char)(charOut-i+1); j<=charOut; j++){
                System.out.print(j);
            } 
        }
    }

}
