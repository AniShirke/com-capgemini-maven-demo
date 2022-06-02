package com.interfa;
//2. use anonymous inner class 
public class App2 {

	public static void main(String[] args) {

	//	SomeInterface obj = new SomeInterface();

		SomeInterface obj = new SomeInterface() {
			@Override
			public void someMethod() {
				System.out.println("someMethod() implemented.");
			}
		};

		obj.someMethod();
	}
}