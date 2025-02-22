/*

1
01
101
0101
10101

 */
package Practice;

import java.util.Scanner;

public class Pattern_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int userIn = sc.nextInt();
        int out = 0;
        for(int i=0; i<userIn; i++){
            out = (i % 2 == 0) ? 1 : 0;
            System.out.println("");
            for(int j=0; j<=i; j++){
                    System.out.print(out);
                    out = (out == 1) ? 0 : 1;
                }
            }

	}

}
