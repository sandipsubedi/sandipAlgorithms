/*

Problem

Given a list of space separated words, reverse the order of the words. Each line of text contains L letters and W words. A line will only consist of letters and space characters. There will be exactly one space character between each pair of consecutive words.

Input

The first line of input gives the number of cases, N.
N test cases follow. For each test case there will a line of letters and space characters indicating a list of space separated words. Spaces will not appear at the start or end of a line.

Output

For each test case, output one line containing "Case #x: " followed by the list of words in reverse order.

Limits

Small dataset

N = 5
1 = L = 25

Large dataset

N = 100
1 = L = 1000

Sample

Input
	
Output
3
this is a test
foobar
all your base
	Case #1: test a is this
Case #2: foobar
Case #3: base your all

*/

public class CodeJam {

    public static void main(String[] args) throws Exception {

        File file = new File("B-large-practice.in");
        Scanner scan = new Scanner(file);
        int length = scan.nextInt();
        scan.nextLine();
        
        int count = 0;
        while(scan.hasNext()){
        String temp =  scan.nextLine();
        String[] array =  temp.split(" ");
        count ++;
        System.out.print("Case #" +count +": " );
        for(int x=array.length-1;x>=0;x--){
            System.out.print(array[x] + " ");
        }
            System.out.println("");
        
        }
               
    }

}


