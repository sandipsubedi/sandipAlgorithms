package interview.pkg1.pkg1;

// Author: Sandip Subedi
public class Interview11 {
   

public static void main(String[] args) {

String[] a={"A","B","C"};

// starts at 0, and with array a 
permute(0, a);

}

public  static void permute(int start, String[] input ) {
        if (start == input.length) {
            //System.out.println(input);
            for(int x = 0;x<input.length;x++){
                System.out.print(input[x]);
            }
            System.out.println("");   
             //System.out.println("we are here");
            return;
            
           
        }
        for (int i = start; i < input.length; i++) {
           
            // swapping elemenent at i and element at start
            // for the array input
            swap(i,start,input);
           
            permute(start + 1, input);            
            
            // swapping elemenent at i and slement at start
            // for the array input
            swap(i,start,input);           
            
        }
    }


public static void swap(int i, int start, String[] input ){
    String temp = input[i];
    input[i] = input[start];
    input[start] = temp;
}
    
}
