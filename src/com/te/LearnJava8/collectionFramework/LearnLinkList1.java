package com.te.LearnJava8.collectionFramework;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.TreeSet;

public class LearnLinkList1 {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Mahesh");
		linkedList.add("Ramesh");
		linkedList.add("Suresh");
		linkedList.add("Sachin");

		TreeSet<String> set=new TreeSet<>(linkedList);
//		set.addAll(linkedList);
		System.out.println(set);
		
		
		System.out.println(linkedList);

		System.out.println();

		for (int i = 0; i < linkedList.size(); i++) {
			System.out.print(linkedList.get(i) + " ");
		}

		System.out.println();

		for (String string : linkedList) {
			System.out.print(string + " ");
		}
		System.out.println();

		Iterator<String> iterator = linkedList.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}

		System.out.println();

		ListIterator<String> iterator2 = linkedList.listIterator(linkedList.size());
		while (iterator2.hasPrevious()) {
			System.out.print(iterator2.previous() + " ");

		}
		System.out.println();

		System.out.println("Sream");

		linkedList.stream().forEach(c -> System.out.print(c + " "));
		System.out.println();
		Object[] array = linkedList.toArray();
		System.out.println(Arrays.toString(array));
		
	

	}

}
