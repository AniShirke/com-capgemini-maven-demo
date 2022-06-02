package com.cg.demo.coll;

import java.util.ArrayList;
import java.util.List;

public class ItDemo {
	
	public static void main(String[] args) {
		
		
		List<String> list =new ArrayList<>();
		
		list.add("sonu");
		list.add("tonu");
		list.add("ponu");
		list.add("gonu");
		list.add("monu");
		
		System.out.println(list);
		System.out.println("Using loop");
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		System.out.println("Using for each");
		for(String elem:list)
		{
			System.out.println(elem);
		}
		
	}

	
}
