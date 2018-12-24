package javaPractice;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class AmazonProblem5_RemoveCharFromSting_Iteravtive {

	public static void main(String[] args) {

		String str = "Hello java";

		// Convert the sting to char array:
		char charArray[] = str.toCharArray();
		// define a string buffer variable
		StringBuffer myBuffer = new StringBuffer();
		for (int i = 0; i < charArray.length; i++) {
			if (!(charArray[i] == 'a')) {
				myBuffer.append(charArray[i]);
			}

		}
		System.out.println("Final String after Removing  \"a\" : " + myBuffer.toString());
	}
	

	

}
