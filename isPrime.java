public static void main(String[] args) {

        System.out.println(isPrime(100));

       }
                
    
    private static boolean isPrime(int num) {
        
        boolean toReturn = true;
        if(num ==2 || num ==3){
            return true;
        }
        
        for (int i = 2; i < num; i++) {
            if(num % i == 0){
                toReturn = false;
                return toReturn;
            }
            
            else{
                toReturn = true;
            }
        }
        
        return toReturn;
}
