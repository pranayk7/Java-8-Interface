package com.pk.service;

// In java8 interface we can define the methods
// We can use this terminology to add new methods to existing interface
public interface InterfaceB {
	
//	The methods can be defined using default keyword
	default void show() {
		System.out.println("Interface B show method");
	}

}
