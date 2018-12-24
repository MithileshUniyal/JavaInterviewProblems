package javaPractice;

import java.util.Arrays;

public class SmallestPositiveInteger {

	public static void main(String[] args) {
		
		int arr[]={-10,-7,1,2,3,6,8,17};
		Arrays.sort(arr);
		
		for(int i=0;i<=arr.length;i++){
			if(i>=arr.length){
				break;
			}
			if(arr[i]>0 && arr[i]<arr[i+1] && i<arr.length){
				System.out.println("smallest Positive integer in the array is : "+arr[i]);
				break;
			}
		}

	}

}
