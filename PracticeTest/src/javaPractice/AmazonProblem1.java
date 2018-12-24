package javaPractice;

public class AmazonProblem1 {

	public static void main(String[] args) {
	
		   /*  Input is an array of integers, and output should be generated in the below pattern:
			input: int[] array = {1,2,3,4};
			output: if 1 is input, output should be multiples of 2*3*4=24
			if 2 is input, output should be multiples of 1*3*4=12 and so on.
			(i.e., multiples of all numbers except of itself).*/
		
		int arr[]={1,2,3,4};
		int num=4;
		int result=1;
		for(int i=0;i<arr.length;){
			if(arr[i]==num){
				i++;
			}else{
				result=result*arr[i];
				i++;
			}
		}
		System.out.println(">>>" +result);

	}

}
