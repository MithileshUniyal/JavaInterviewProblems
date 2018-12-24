package javaPractice;

public class Max3NumbersFromArray {

	public static void main(String[] args) {
		
		int arr[]={10,6,9,2,6,4,13};
		int max1=0, max2=0,max3=0;
		for(int i=0;i<arr.length;i++){
			
		if(arr[i]>max1){
			max3=max2;
			max2=max1;
			max1=arr[i];
		}
		else if(arr[i]>max2){
			max3=max2;
			max2=arr[i];
			
		}
		else if(arr[i]>max3 ){
			max3=arr[i];
			
		}
		
		}
System.out.println(max1 +" >> " + max2 +">> " +max3);
	}

}
