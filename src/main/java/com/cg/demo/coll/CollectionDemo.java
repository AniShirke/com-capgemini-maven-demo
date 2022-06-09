package com.cg.demo.coll;

import java.util.ArrayList;

public class CollectionDemo {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list =new ArrayList<>();
		
		
		//Add operation
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println(list);
		
//		list.remove(0);
		
	//	System.out.println(list);
	
	
	   int element=list.get(0);
	   System.out.println(element);
	   
	   list.add(3,4);
	   System.out.println(list);
	   
	}

	private static int get(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int add(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	//Remove operation
	

}
