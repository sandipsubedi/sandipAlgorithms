/*
Work out the first ten digits of the sum of NN 50-digit numbers.

Input Format 
First line contains NN, next NN lines contain a 50 digit number each.

Output Format 
Print only first 10 digit of the final sum

Constraints 
1=N=1031=N=103

Sample Input

5
37107287533902102798797998220837590246510135740250
46376937677490009712648124896970078050417018260538
74324986199524741059474233309513058123726617309629
91942213363574161572522430563301811072406154908250
23067588207539346171171980310421047513778063246676

Sample Output

2728190129


*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt(); 
        scan.nextLine();
        // using BigInteger : Initializing at 0
        BigInteger sum = new BigInteger("0");
        String temp;
        String j = "";
        for(int x=0;x<length;x++){
            temp = scan.nextLine();
            j+=String.valueOf(temp) + ;
            BigInteger tempInt = new BigInteger(temp);      
            sum = sum.add(tempInt);
        }
        String testString =  sum + "";
       System.out.println(testString.substring(0,10));
        
        String s = String.valueOf(j);
        s=s.replace(".", "");
        s=s.substring(0, 10);
        System.out.print(s);
        
        
    }
}



