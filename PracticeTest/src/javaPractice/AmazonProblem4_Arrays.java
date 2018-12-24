package javaPractice;

public class AmazonProblem4_Arrays {

	public static void main(String[] args) {
		
		int a1[]={10,20,30,40,50};
		int a2[]={5,10,15,20};
		int lenA1=a1.length;
		int lenA2=a2.length; int x=a2.length-1;
		int limit; int max1=a1[0];int max2=a2[0];
		if(lenA1>lenA2){
			limit=lenA1;
		}else limit=lenA2;
		for(int i=1;i<limit;i++){
			
			if(a1[i]>max1){
				//System.out.println(i);
				max1=a1[i];
				
			}
			//System.out.println(a2[i] +"  >> "+i +a2.length);
			if(i<=x && a2[i]>max2){
				//System.out.println(i);
				max2=a2[i];
			}
		}
         //System.out.println(max1 +" >>>  " +max2);
		System.out.println(max1/10 + " >>>> "+ max2/5);
	}

}
