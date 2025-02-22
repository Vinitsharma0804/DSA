/*

Written by          : Vinit Sharma
Dated               : 19/01/2025
Problem number 		: 1941

Given a string s, return true if s is a good string, or false otherwise.
A string s is good if all the characters that appear in s have the same number of occurrences (i.e., the same frequency).
Example 1:

Input: s = "abacbc"
Output: true
Explanation: The characters that appear in s are 'a', 'b', and 'c'. All characters occur 2 times in s.
Example 2:

Input: s = "aaabb"
Output: false
Explanation: The characters that appear in s are 'a' and 'b'.
'a' occurs 3 times while 'b' occurs 2 times, which is not the same number of times.

 */

package LeetCode;

import java.util.Arrays;

public class A0001_CharOccuranceCount_1941 {
	public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        //int out = climbStairs(5);
        boolean out = areOccurrencesEqual("vvvvvvv");
        System.out.println(out);
    }
    public static boolean areOccurrencesEqual(String s) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        int currIndex=1;
        int count = 0;
        int prevCount = 0;
        String prevChar, currChar = "";
        for(int i=0; i<charArray.length; i++){
            currChar = Character.toString(charArray[i]);
            if (i == 0)
                prevChar = Character.toString(charArray[i]);
            else
                prevChar = Character.toString(charArray[i-1]);
            System.out.println("currIndex: "+currIndex+", currChar:"+currChar+", prevChar:"+prevChar);
            System.out.println("count: "+count+", prevCount:"+prevCount);
            if(!currChar.equals(prevChar)){
                //System.out.println("Not Matched");
                if(currIndex>1 && count!=prevCount)
                    return false;
                currIndex = currIndex + 1;
                prevCount = count;
                count = 0;
            }
            count = count + 1;
            if(i==charArray.length-1){
                if(currIndex>1 && count!=prevCount)
                    return false;
            }
        }
        return true;
    }

}
