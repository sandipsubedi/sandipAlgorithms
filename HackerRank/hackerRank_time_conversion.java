/*


Given a time in AM/PM format, convert it to military (24-hour) time.

Note: Midnight is 12:00:00AM on a 12-hour clock and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock and 12:00:00 on a 24-hour clock.

Input Format

A time in 12-hour clock format (i.e.: hh:mm:ssAM or hh:mm:ssPM), where 01=hh=1201=hh=12.

Output Format

Convert and print the given time in 24-hour format, where 00=hh=2300=hh=23.

Sample Input

07:05:45PM
Sample Output

19:05:45

Explanation

7 PM is after noon, so you need to add 12 hours to it during conversion. 12 + 7 = 19. Minutes and seconds do not change in 12-24 hour time conversions, so the answer is 19:05:45.
*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        String in =  scan.nextLine();
        
        String hh =  in.substring(0,2);
        int hours = Integer.parseInt(hh);
        String mm =  in.substring(3,5); // skipping the :
        String ss =  in.substring(6,8);
        
        String amPm = in.substring(8,9);
        
               
        if(hours<12 && amPm.equals("P")){
            hours += 12;
        }
        
        else if(hours==12 && amPm.equals("A")){
            hours = 0;
        }
        
        System.out.printf("%02d:%s:%s",hours,mm,ss);
               
        
        
    }
}