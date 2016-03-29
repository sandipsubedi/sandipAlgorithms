/*


2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

*/
        int divider ;
        // I took out the lowest common multiple from all the numbers 
        // 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
        divider =   2*2*2*3*3*5*7*11*13*2*17*19;
        
        System.out.println(divider);
        
        // just checking if the number is correct or not
        for (int i = 1; i < 21; i++) {
            if(divider%i !=0){
                System.out.println(i);
            }
        }

