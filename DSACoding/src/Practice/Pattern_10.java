/*
    A    
   ABA   
  ABCBA  
 ABCDCBA 
ABCDEDCBA

 */
package Practice;

import java.util.Scanner;

public class Pattern_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int userIn = sc.nextInt();
        
        for(int i=1; i<=userIn; i++){
            char charOut = 'A';
            System.out.println("");
            for(int j=1; j<=userIn-i; j++){
                    System.out.print(" ");
                }
            for(int j=1; j<=i; j++){
                    System.out.print(charOut);
                    charOut++;
                }
            charOut--;
            for(int j=1; j<=i-1; j++){
                    charOut--;
                    System.out.print(charOut);
                }
            for(int j=1; j<=userIn-i; j++){
                    System.out.print(" ");
                }
            }
    }

}
