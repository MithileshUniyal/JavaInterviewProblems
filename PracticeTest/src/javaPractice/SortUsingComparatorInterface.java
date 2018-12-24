package javaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortUsingComparatorInterface implements Comparator<String> {

	public static void main(String[] args) {
		
		ArrayList myList=new ArrayList();
		myList.add("java");
		myList.add("apple");
		myList.add("banana");
		myList.add("bottle");
		
		
		Collections.sort(myList, new SortUsingComparatorInterface());
		
		System.out.println(myList.toString());
		
	}

	@Override
	public int compare(String o1, String o2) {
		
		return o2.compareTo(o1);
	}

}
