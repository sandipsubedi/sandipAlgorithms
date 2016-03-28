/*
n mathematics, the notion of permutation relates to the act of rearranging, or permuting, all the members of a set into some sequence or order (unlike combinations, which are selections of some members of the set where order is disregarded). For example, written as tuples, there are six permutations of the set {1,2,3}, namely: (1,2,3), (1,3,2), (2,1,3), (2,3,1), (3,1,2), and (3,2,1). As another example, an anagram of a word, all of whose letters are different, is a permutation of its letters. The study of permutations of finite sets is a topic in the field of combinatorics.

Given two strings s1 and s2,check if they are permutations of each other and print number of permutations of string s1.

You can assume that there will be no duplicate characters in both the strings.

Input Format

Two strings will be given as input.

Output Format

If they are permutations of each other,print "Yes" with the count of number of permutations of string s1. Else print "No" with the count of number of permutations of string s2.

Sample Input

andrew wednar

Sample Output

Yes 720

Explanation

You can see that both are permutations of each other. The number of permutations of "andrew" is 720. 

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
        
        String first =  scan.next();
        String second =  scan.next();
        
        first =  sort(first);
     
        
        second =  sort(second);
       // System.out.println(second);
        
        if(first.equals(second)){
            // yes and number of permutation of first
               System.out.println("Yes "+ factorial(first.length()));
            
        }
        // else no and number of permuttion of seconad
        else{
         System.out.println("No " + factorial(second.length()));

            
        }
        
        
    }
    
    public static String sort(String str){
        char[] array =  str.toCharArray();
        Arrays.sort(array);
        return new String(array);
    }
    
    public static int factorial(int num){
        
        if(num == 1){
            return 1;
        }
        
        return factorial(num-1)*num;
    }
    
    
}
