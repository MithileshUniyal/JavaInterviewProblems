package javaPractice;

public class ArrayIndexEqualsToValue {

	public static void main(String[] args) {
		
		int nums[]={-4,-2,2,4,6,5};
		
		for(int i=0;i<nums.length;i++){
			if(i==nums[i]){
				System.out.println("The index Where the array value and index are same is >> "+i);
			}
		}
		

	}

}
