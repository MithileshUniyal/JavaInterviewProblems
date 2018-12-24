package javaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ComparatorImpl {

	public static void main(String[] args) {
	
		Map<String, Integer> myMap=new HashMap<String, Integer>();
		myMap.put("Java", 1);
		myMap.put("Ruby", 5);
		myMap.put("Python", 2);
		myMap.put("JavaScript", 7);
		
		//Sorting logic to sort the  map values based in Map key&value, using comparator
		
List<Entry<String, Integer>> myList=new LinkedList<Entry<String, Integer>>(myMap.entrySet());
Collections.sort(myList,new Comparator<Map.Entry<String,Integer>>() {

	@Override
	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {

		
		return o2.getValue().compareTo(o1.getValue());
	}
});

for(Entry<String, Integer> SortedItems:myList){
	System.out.println(SortedItems);
}
}
}
