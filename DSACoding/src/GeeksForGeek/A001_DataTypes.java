/*
Written by			: Vinit Sharma
Dated 				: 14-02-2025
Problem number  	: 

Geek is learning a new programming language. As data type forms the most fundamental part of a language, Geek is learning them with focus and needs your help.
Given a data type, help Geek in finding the size of it in byte.
Data Type - Character, Integer, Long, Float and Double
Example 1:
Input: Character
Output: 1
Explanation: For java it would be 2 bytes.
Example 2:
Input: Integer
Output: 4
 
Your Task:
Complete the function dataTypeSize() which takes a string as input and returns the size of the data type represented by the given string in byte unit.
Return -1 if the input data type is invalid.
*/
package GeeksForGeek;

public class A001_DataTypes {
	public static void main(String[] args) {
		String str = "String";
		int size = 0;
        if (str.equals("Character")){
            size = 2;
        }else if (str.equals("Integer")){
            size = 4;
        }else if (str.equals("Long")){
            size = 8;
        }else if (str.equals("Float")){
            size = 4;
        }else if (str.equals("Double")){
            size = 8;
        }else{
            size = -1;
        }
        System.out.println(size);
    }
}
