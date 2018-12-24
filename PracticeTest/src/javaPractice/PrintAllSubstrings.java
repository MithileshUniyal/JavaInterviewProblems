package javaPractice;

public class PrintAllSubstrings {

	public static void main(String[] args) {
		
		String str= "Substrings";

		for(int i=0;i<str.length();i++){
			System.out.println(str.substring(i, str.length()));
		}
		
	}

}
