package javaPractice;

public class CheckArmstrong {

	public static void main(String[] args) {
		int num=371;
		int toTest=num;
		 int product=0;
		while(num>0){
		    double temp=num%10;
		    product=(int) (product+Math.pow(temp,3));
		    System.out.println(Math.pow(temp,3));
		    num=num/10;
		}
		System.out.println(product);
		if(toTest==product){
		    System.out.println("Armstrong");
		}
		
		}

	}


