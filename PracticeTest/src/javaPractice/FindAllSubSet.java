package javaPractice;

import java.util.Date;

public class FindAllSubSet {

	public static void main(String[] args) {
		
		String [] items={"a","b","c"};
		findSubSet(items);
		
		
	}

	private static void findSubSet(String[] items) {
	
		for(int i=0;i<items.length;i++){
			System.out.print("{" +items[i] +" }");
			
			for(int j=0;j<items.length;j++){
				if(!(i==j)&& j>i){
					System.out.print("{" +items[i] +"," +items[j]+" }");
				}
			}
		}
		
	}
	
}
