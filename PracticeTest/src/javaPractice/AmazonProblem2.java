package javaPractice;

public class AmazonProblem2 {

	public static void main(String[] args) {

		/* When input is String: "a2b3c7d6", generate an output which adds all the numbers in the displayed string.
		 input: String s="a2b3c7d6";
		 output: Ouput should be displayed as '18' (as 2+3+7+6=18)*/

		String str="a2b3c4d6";
		int sum=0;
		for(int i=0;i<str.length();){
			char character=str.charAt(i);
			if(!(Character.isLetter(character))){
				sum=sum+(str.charAt(i));
				
				System.out.println(str.charAt(i) +sum);
				i++;
			}else{
				i++;
			}
		}
		System.out.println(">>>> "+ sum);
		
		
	}

}
