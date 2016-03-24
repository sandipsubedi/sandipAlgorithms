/*
Sorting is often useful as the first step in many different tasks. The most common task is to make finding things easier, but there are other uses, as well.

Challenge
Given a list of unsorted integers, A={a1,a2,…,aN}A={a1,a2,…,aN}, can you find the pair of elements that have the smallest absolute difference between them? If there are multiple pairs, find them all.

Input Format
The first line of input contains a single integer, NN, representing the length of array AA.
In the second line, there are NN space-separated integers, a1,a2,…,aNa1,a2,…,aN, representing the elements of array AA.

Output Format
Output the pairs of elements with the smallest difference. If there are multiple pairs, output all of them in ascending order, all on the same line (consecutively) with just a single space between each pair of numbers. If there's a number which lies in two pair, print it two times (see the sample case #3 for explanation).

Constraints

    2=N=2000002=N=200000
    -107=ai=107-107=ai=107
    ai?aj,where 1=i<j=N



Sample Input #1

10
-20 -3916237 -357920 -3620601 7374819 -7330761 30 6246457 -6461594 266854 

Sample Output #1

-20 30

Explanation
(30) - (-20) = 50, which is the smallest difference. 




Sample Input #2

12
-20 -3916237 -357920 -3620601 7374819 -7330761 30 6246457 -6461594 266854 -520 -470 

Sample Output #2

-520 -470 -20 30

Explanation
(-470) - (-520) = 30 - (-20) = 50, which is the smallest difference. 

Sample Input #3

4
5 4 3 2

Sample Output #3

2 3 3 4 4 5

Explanation
Here, the minimum difference will be 1. So valid pairs are (2, 3), (3, 4), and (4, 5). So we have to print 2 once, 3 and 4 twice each, and 5 once

*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
   Scanner scan =  new Scanner(System.in);
   int length =  scan.nextInt();
   scan.nextLine();
   
   int[]  myArray =  new int[length];
        
    // array is created    
    for(int x =0;x<length;x++){
        int temp =  scan.nextInt();
        myArray[x] = temp;
    }    
        
    // lets sort the array
        
    Arrays.sort(myArray); // array is sorted
        
        
    int left =  Math.abs(myArray[0]);
    int right =  Math.abs(myArray[1]);
    
    int diff;
    int min;
        
    String toReturn = "";        
   min = Math.abs(right - left);
       
   // so we have base left, right and diff
        
  for(int x =2;x<myArray.length-1;x++){
      left =  Math.abs(myArray[x]);
      right =  Math.abs(myArray[x+1]);
      diff = Math.abs(right - left);
      
      if(diff < min){
        min = diff;
        toReturn  = myArray[x] + " " + myArray[x+1];
      }
      
      else if(diff == min){
          toReturn += " " + myArray[x] + " " + myArray[x+1] ;
      }
      
  }
       
    System.out.println(toReturn);               
    }
}