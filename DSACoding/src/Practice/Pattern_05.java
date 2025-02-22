/*
1        1
12      21
123    321
1234  4321
1234554321
 */

package Practice;

import java.util.Scanner;

public class Pattern_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int userIn = sc.nextInt();
        for(int i=1; i<=userIn; i++){
            System.out.println("");
            for(int j=1; j<=i; j++){
                    System.out.print(j);
                }
            for(int j=1; j<=2*(userIn-i); j++){
                    System.out.print(" ");
                }
            for(int j=i; j>=1; j--){
                    System.out.print(j);
                }
            }
    }

}
