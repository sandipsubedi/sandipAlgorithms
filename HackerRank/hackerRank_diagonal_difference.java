/*
Given a square matrix of size N×NN×N, calculate the absolute difference between the sums of its diagonals.

Input Format

The first line contains a single integer, NN. The next NN lines denote the matrix's rows, with each line containing NN space-separated integers describing the columns.

Output Format

Print the absolute difference between the two sums of the matrix's diagonals as a single integer.

Sample Input:
3
11 2 4
4 5 6
10 8 -12

Sample Output

15

Explanation

The primary diagonal is:
11
      5
            -12

Sum across the primary diagonal: 11 + 5 - 12 = 4

The secondary diagonal is:
            4
      5
10
Sum across the secondary diagonal: 4 + 5 + 10 = 19
Difference: |4 - 19| = 15


*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan =  new Scanner(System.in);
        
        int length =  scan.nextInt();
        
        int[][] array =  new int[length][length];
        
        int total=0;
        // this is to check for the secondary diagonal
        int countLow = 0;
        int countHigh = length-1;
            
        
        
            for(int x =0; x<length;x++){
            for(int y=0;y<length;y++){
                int temp  =  scan.nextInt();
                array[x][y] = temp;
                if(x==y){
                    total += temp;
                   // System.out.println( "first" + temp);
                   }
                
                if(x == countLow && y == countHigh ){
                    total -= temp;
                    //System.out.println("second" + temp);
                }
                
            }
            countLow ++;
            countHigh --;
                 
                 
        }
        
        System.out.println( Math.abs(total));
        
    }
}