package com.k2js.Exercise.InterfaceAbstraction;

public interface interfaceA {
	void display();
	default void common() {
		System.out.println("test");
	}

}
