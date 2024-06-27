package com.te.LearnJava8.collectionFramework.logics;

import java.util.ArrayList;
import java.util.HashSet;

public class ListOfIntToUniqueList {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList=new ArrayList<>();
		arrayList.add(4);
		arrayList.add(5);
		arrayList.add(3);
		arrayList.add(8);
		arrayList.add(7);
		arrayList.add(8);
		arrayList.add(9);
		
		HashSet<Integer> hashSet=new HashSet<>(arrayList);
		System.out.println(hashSet);
		
	}

}
