package javaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UncommonElementsInTwoArrays {

	public static void main(String[] args) {
		
		ArrayList<Integer> myList1=new ArrayList<Integer>(Arrays.asList(1,2,4,5,6));
		ArrayList<Integer> myList2=new ArrayList<Integer>(Arrays.asList(1,2,4,5,7,8,9));
	/*	int arr2[]={2,3,1,6,8};
	int arr1[]={1,2,5,4,6,8,9};
	
		boolean isPresent=false;
		
		for(int i=0;i<arr1.length;i++){
			isPresent=false;
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
					isPresent=true;
					break;
				}
			}
			if(isPresent==false){
				System.out.println(" >>>" +arr1[i]);
			}
		}
		
		for(int i=0;i<arr2.length;i++){
			isPresent=false;
			for(int j=0;j<arr1.length;j++){
				if(arr2[i]==arr1[j]){
					isPresent=true;
					break;
				}
			}
			if(isPresent==false){
				System.out.println(" >>>" +arr2[i]);
			}
		}*/
		
		//Approach 2: Using Sets:
		Set<Integer> mySet=new HashSet<Integer>();
		mySet.addAll(myList1);
		for(int num: myList2){
			if(mySet.add(num)==false){
				mySet.remove(num);
			}
		}
		System.out.println(mySet.toString());
		
		
	}
}
