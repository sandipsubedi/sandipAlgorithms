/*

********* Slightly modified question **************


Write a method to replace all spaces in a string with '%20' ....

EXAMPLE:
Input : Mr John Smith
Output : "Mr%20John%20Smith"
*/

	Scanner scan = new Scanner(System.in);
        
        String input = scan.nextLine();
        int length  = input.trim().length();
        
        String toReturn =  "";
        
        for(int x =0;x<length;x++){
            if(input.charAt(x) != ' '){
                toReturn += input.charAt(x);
                
            }
            else{
                toReturn +="%20";
            }
        }

        System.out.println(toReturn);
        