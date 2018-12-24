package javaPractice;

import java.util.Random;
import java.util.regex.Pattern;

public class GenerateRandomNo {

	public static void main(String[] args) {
		
		Random rand=new Random();
System.out.println(rand.nextInt(100));
String str="abcdADB";
System.out.println(str.matches("[A-Za-z]+"));

	}

}
