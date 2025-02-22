/*

555555555 
544444445 
543333345 
543222345 
543212345 
543222345 
543333345 
544444445 
555555555

 */
package Practice;

import java.util.Scanner;

public class Pattern_15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int userIn = sc.nextInt();
        int top, bottom, left, right, result = 0;
        for(int i=0; i<2*userIn-1; i++){
            System.out.println(" ");
            for(int j=0; j<2*userIn-1; j++){
                top = i;
                bottom = 2*userIn - 2 - i;
                left = j;
                right = 2*userIn - 2 - j;
                result = userIn - Math.min(Math.min(top, bottom), Math.min(left, right));
                System.out.print(result);
            } 
        }
    }

}
