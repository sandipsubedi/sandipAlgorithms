COOLEST NUMBER
Max. Marks: 0
A coolest number is a number whose sum of the digits in odd places is equals sum of digits in even places.

SAMPLE INPUT:

23650

157

SAMPLE OUTPUT:

True

False

/*EXPLANATION:

In the first case, the sum of digits in odd places is 2+6+0 = 8.

The sum of digits in Even places is 3+5 = 8.

8 = 8

Hence True.

In the second case, the sum of digits in odd places is 1 + 7 = 8.

The sum of digits in Even places is 5

8 ? 5

Hence false.

*/

import java.util.Scanner;


public class Interview11 {

    public static void main(String[] args) {

               
        
      Scanner scan = new Scanner(System.in);
      while(scan.hasNext()){
          
          
      String str =  scan.nextLine();
        
        int even = 0;
        int odd = 0;
        
        for(int x=0;x<str.length();x++){
            int temp = Integer.parseInt(str.charAt(x)+"");
            if(x%2==0){ // even
            even+=temp;
            }
            else{ // odd
                odd+=temp;
            }
        }
        
        if(odd==even){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
            
          
      }
       
    }

}





