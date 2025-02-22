/*
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15
 */
package Practice;

import java.util.Scanner;

public class Pattern_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int userIn = sc.nextInt();
        int out = 1;
        for(int i=1; i<=userIn; i++){
            System.out.println("");
            for(int j=1; j<=i; j++){
                    System.out.print(out + " ");
                    out ++;
                }
            }
    }

}
