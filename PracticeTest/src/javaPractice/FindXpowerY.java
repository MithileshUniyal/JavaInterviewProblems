package javaPractice;

public class FindXpowerY {

	public static void main(String[] args) {
		int num=5; int pow=4;
		System.out.println(findXPowerY(num,pow));

	}

	private static int findXPowerY(int num, int pow) {
		
		int product=1;
		while(pow>0){
			product=product*num;
			pow--;
		}
		return product;
		
		
	}

}
