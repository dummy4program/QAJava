package local.qa.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise {

	public static void main(String[] args) {
	
		//create a new ArrayList
		
		List<String> listyList = new ArrayList<>();
		
		//add() several elements
		
		listyList.add("this");
		listyList.add("is");
		listyList.add("an");
		listyList.add("array");
		listyList.add("list");
		
		//print out the entire ArrayList
		
		System.out.println(listyList);
		
		//iterate through the ArrayList and print out each element (with both normal and enhanced for-loops)
		
		for (int i = 0; i < listyList.size(); i++) {
			System.out.println(listyList.get(i));
		}
		
		for (String i : listyList) {
			System.out.println(i);
		}
		
		//get() specific elements
		
		System.out.println(listyList.get(4));
		System.out.println(listyList.get(0));
		System.out.println(listyList.get(1));
		
		//set() different elements
		
		listyList.set(2, "not");
		listyList.set(3, "an");
		listyList.set(4, "elephant");
		System.out.println(listyList);
		
		//remove() elements
		
		listyList.remove(4);
		listyList.remove(3);
		System.out.println(listyList);
		
		//sort() the ArrayList (try this with several object types)
		
		Collections.sort(listyList);
		System.out.println(listyList);
		
		//try using the reverse(), swap() and clone() methods from the Collections class
		
		Collections.reverse(listyList);
		System.out.println(listyList);
		
		Collections.swap(listyList, 0, 1);
		System.out.println(listyList);
		
	}

}
