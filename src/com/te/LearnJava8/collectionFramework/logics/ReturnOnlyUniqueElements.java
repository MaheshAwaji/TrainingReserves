package com.te.LearnJava8.collectionFramework.logics;

import java.util.ArrayList;

public class ReturnOnlyUniqueElements {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList=new ArrayList<>();
		ArrayList<Integer> arrayList2=new ArrayList<>();
		arrayList.add(2);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		arrayList.add(6);
		arrayList.add(4);
		
		System.out.println(arrayList);
		for (Integer integer : arrayList) {
			int count=0;
			for (Integer integer2 : arrayList) {
				if (integer==integer2) {
					count++;	
				}
			}
			if (count==1) {
				arrayList2.add(integer);
			}
			
		}
		
		System.out.println(arrayList2);
	}

}
