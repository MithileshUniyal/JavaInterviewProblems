package javaPractice;

public class AmazonProblem3_PrintSeries {

	public static void main(String[] args) {
	
	String str="a2b2c3";
		char leftchar = 0;
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			
			if(Character.isDigit(Integer.valueOf(ch))){
				int num=ch-'0';
				for(int j=0;j<num;j++){
					System.out.print(str.charAt(i-1));
				}
				}
			}

		
	
	}

	}
