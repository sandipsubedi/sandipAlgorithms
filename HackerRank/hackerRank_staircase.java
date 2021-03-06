/* Source: https://www.hackerrank.com/challenges/staircase:

Your teacher has given you the task of drawing a staircase structure. Being an expert programmer, you decided to make a program to draw it for you instead. Given the required height, can you print a staircase as shown in the example?

Input
You are given an integer NN depicting the height of the staircase.

Output
Print a staircase of height NN that consists of # symbols and spaces. For example for N=6N=6, here's a staircase of that height:

     #
    ##
   ###
  ####
 #####
######

Note: The last line has 0 spaces before it. 

************************************************
Time Complexity : O(N)
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        
        int length =  scan.nextInt();
        
        String str = "#";
        String newStr = "";
        String blank = " ";
        String newBlank="";
        // just populate the blank string 
          for(int x=0;x<length;x++){
             newBlank+=blank;
        }
        
        int subStringCount  = length;
        // this will print the blank part and # part
        for(int x=0;x<length;x++){
             newStr+=str;
            
            System.out.print(newBlank.substring(0,subStringCount-1));
            System.out.println(newStr);
           subStringCount--;
        } 
    }
}

