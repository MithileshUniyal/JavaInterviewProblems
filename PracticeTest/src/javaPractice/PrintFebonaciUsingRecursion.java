package javaPractice;

public class PrintFebonaciUsingRecursion {

	public static void main(String[] args) {
	
		for(int i=0;i<10;i++){
			System.out.println(printFebo(i));
		}
		

	}

	private static int printFebo(int limit) {
	while(true){
		if(limit<=1){
			return limit;
		}else{
			return printFebo((limit-1)) +printFebo((limit-2));
		}
}
}
}