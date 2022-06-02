package com.interfa;

//to use someMethod() from someInterface - 
 

 //1. class implements interface 
public class App3 implements SomeInterface {
	public static void main(String[] args) {
		App3 obj = new App3();
		obj.someMethod();
	}

	@Override
	public void someMethod() {
		System.out.println("someMethod() implemented.");
	}
}