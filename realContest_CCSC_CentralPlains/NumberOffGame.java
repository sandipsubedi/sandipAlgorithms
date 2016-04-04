import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

class NumberOffGame {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		LinkedList<Integer> list = new LinkedList<>();
		
		File file = new File("numberoffinputs.txt");
		
		Scanner scan = new Scanner(file);
		
		LinkedList<Integer> list2;
		
		int number ;
		int increment ;
		int position ;
		String[] arr;
		
	
		
		
		while(scan.hasNextLine()){
			list2 = new LinkedList<>();
			list = new LinkedList<>();
			arr = scan.nextLine().split(",");
			
			number = Integer.parseInt(arr[0]);
			position = Integer.parseInt(arr[1]);			
		    increment = Integer.parseInt(arr[2]);
		    
		   // System.out.println(arr[0]+ " "+ arr[1]+ " "+ arr[2]);
			for(int i =1; i< number+1; i++){
				list.add(i);
			}
			
			
			// System.out.println(list);
			
			int place = increment + position -2; // 1 for curent , 1 sinec starts at 0
			
			// removing from the list
			for(int x =0;x<number;x++){
				
			while(place > list.size()){
				place = place-list.size();
			}
			if(place == list.size()){
					place = 0;
				}
								
				// list2.add(x);
				//System.out.println("Place: "+ place + " size: "+ list.size());
			
				list2.add(list.get(place));
				list.remove(place);
				place = place + increment-1;			
				
			}
			
			System.out.println(list2);
					
		}
		
		
		
	}
	
	

}
