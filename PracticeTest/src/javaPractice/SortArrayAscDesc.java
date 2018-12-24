package javaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortArrayAscDesc implements Comparator<Integer>{

	public static void main(String[] args) {
		int arr[] = {1,2,3,0,10,8,88,765};
		
		//Ascending order... Using Arrays.Sort
		
		Arrays.sort(arr);
       for(int n:arr){
    	   System.out.print(n +" ");
       }

       
       //Descending order.. We ca use Collections .reverseOrder() , also comparator impl.
       
       //Approach1: Collections method:
       
ArrayList<Integer> myList=new ArrayList<>();
      for(int n:arr){
    	  myList.add(n);
      }
      /*Collections.sort(myList, Collections.reverseOrder());
      System.out.println(myList.toString());*/
       
      
      //Sorting using custom comparatior:
      
      Collections.sort(myList, new SortArrayAscDesc());
      System.out.println(myList.toString());
       
	}

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return o2.compareTo(o1);
	}


}
