package com.te.LearnJava8.collectionFramework.logics;

import java.util.ArrayList;
import java.util.TreeSet;

public class MaxAndMinFromList {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList=new ArrayList<>();
		
		arrayList.add(2);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		arrayList.add(6);
		arrayList.add(4);
		System.out.println(arrayList);
		
		TreeSet<Integer> integers=new TreeSet<>(arrayList);
		System.out.println("Min Element= "+integers.first());
		System.out.println("Max Element= "+integers.last());

	}

}
