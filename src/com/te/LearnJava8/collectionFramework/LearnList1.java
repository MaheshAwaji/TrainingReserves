package com.te.LearnJava8.collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LearnList1 {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();

		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(null);
		
		System.out.println(list1);
		
		for(int i=0;i<list1.size();i++) {
			System.out.print(list1.get(i)+" ");
		}
		System.out.println();
		
		for (Integer integer : list1) {
			System.out.print(integer+" ");	
		}
		System.out.println();
		Iterator<Integer> iterator=list1.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
			
		}
		System.out.println();
		ListIterator<Integer> listIterator=list1.listIterator();
		while (listIterator.hasNext()) {
			System.out.print(listIterator.next()+" ");
		}
		System.out.println();
		ListIterator<Integer> listIterator1=list1.listIterator();
		while (listIterator1.hasPrevious()) {
			System.out.print(listIterator1.previous()+" ");
		}

		System.out.println();
		System.out.println("Stream ");
		
		list1.stream().forEach(c -> System.out.println(c));
		System.out.println();
		Object[] array=list1.toArray();
		System.out.println(Arrays.toString(array));
	}

}
