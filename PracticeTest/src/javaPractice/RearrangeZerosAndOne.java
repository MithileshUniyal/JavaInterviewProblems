package javaPractice;

public class RearrangeZerosAndOne {

	public static void main(String[] args) {
		
		int arr[]={1,2,5,9,4,6,7};
		
		for(int i=1;i<arr.length;i++){
			if(arr[i]<arr[i-1]){
				int temp=arr[i];
				arr[i]=arr[i-1];
				arr[i-1]=temp;
			}
		}
		for(int n:arr){
System.out.print(n +"  ");


	}
		
	}
	
	
}
