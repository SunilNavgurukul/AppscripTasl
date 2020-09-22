package com.algorithm.appscrip;

import java.util.ArrayList;
import java.util.List;

public class UnionIntersection {
	public static void main(String[] args) {
		int[] arr1 = {1,3,4,5,7};
		int[] arr2 = {2,3,5,6};
		List<Integer> union = new ArrayList<Integer>();
		List<Integer> intersection = new ArrayList<Integer>();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if(arr1[i]==arr2[j]) {
					intersection.add(arr1[i]);
					break;
				}
			}
			union.add(arr1[i]);
		
		}
		for (Integer integer : arr2) {
			if (!union.contains(integer)) {
				union.add(integer);	
			}
		}
		System.out.println(union.toString());
		System.out.println(intersection.toString());
	}

}
