/*
CCSC - Central Plains

*/


import java.util.Scanner;

class Inheritance {

	public static void main(String[] args) {
		int childrenNum;
		int factor;
		int position;
		
		Scanner scan = new Scanner(System.in);
		
		int length = scan.nextInt();
		
		for(int x=0;x<length;x++){
			
			childrenNum= scan.nextInt();
			factor = scan.nextInt();
			position =  scan.nextInt();
			
			int total = 1;
			
			int acquisition = 1;
			
			int[] myArray = new int[childrenNum];
			myArray[0] = 1;
			
			for(int y=0;y<childrenNum-1;y++){
				total+= factor*acquisition;

				myArray[y+1] = factor*acquisition;
				acquisition*=factor;
				
			}
			
			int lenArr = myArray.length;
			
			System.out.println(myArray[lenArr-position] + "/" + total);
//			
			
			
			
		
			
		}
		
		

	}

}
