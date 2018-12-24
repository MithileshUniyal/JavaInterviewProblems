package javaPractice;

import java.util.Arrays;
import java.util.Collections;

public class MoveZerosToEnd {

	public static void main(String[] args) {
	
		Integer arr[]={1,0,3,4,0,7,0,6};
		
	//using already present methods:
		
		/*Arrays.sort(arr, Collections.reverseOrder());
		for(int x:arr){
			System.out.print(x);
		}*/
		
		int count=0;
		for(int i=0;i<arr.length;i++){
			
			if(!(arr[i]==0)){
				arr[count++]=arr[i];
			}
		}
		while(count<arr.length)
			arr[count++]=0;
		
		for(int x:arr){
			System.out.print(x);
		}
		
		
	}

}
