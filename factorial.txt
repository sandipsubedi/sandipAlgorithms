package factorial;

// Author: Sandip Subedi

public class Factorial {

    public static void main(String[] args) {

        /*
        Solving factorial problem both recursive and for-loop way         
        */
                      
        int a = 6;
        System.out.println("in recursive way: ");
        System.out.println(factorial(a));
        
        System.out.println("Using the for looop");
        int total = 1;
        for(int i=1;i<a+1;i++){
            total = total*i;
        }
        System.out.println(total);
        
    }
    
    
    public static int factorial(int a ){
        
        if(a==1){
            return 1;
        }
        return a*factorial(a-1);
        
    }
    }