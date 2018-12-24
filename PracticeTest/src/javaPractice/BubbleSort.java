package javaPractice;

import javax.swing.text.AbstractDocument.LeafElement;

public class BubbleSort {

	public static void main(String[] args) {
		

		//Time complexity of bubble Sort is O(n^2)

		int arr[]={3,5,2,1,6,7,12,4,33,2,23,12,9};
		
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
			if(arr[i]>arr[j]){
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
			
		}
		}
		for(int n: arr){
			System.out.print(n +" ");
		}
		
	}

}
