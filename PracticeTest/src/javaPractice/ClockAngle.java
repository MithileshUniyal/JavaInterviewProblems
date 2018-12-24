package javaPractice;

public class ClockAngle {

	public static void main(String[] args) {
		
		System.out.println("Angle >> "+ calcAngle(3, 30));

	}
	public static int calcAngle(int i, int j){
		double angle = Math.abs((30*i)-(6*j)+(j/2));
		return (int) Math.floor((angle > 180)?(360-angle):(angle));
	}
	
}
