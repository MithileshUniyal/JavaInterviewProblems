package javaPractice;

public class UserDefinedException {

	public static void main(String[] args) {
		
		try{
			throw new MyException("From user Defined Exception");
		}catch(MyException e){
			System.out.println(e);
		}

	}

}
