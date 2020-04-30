package com.k2js.oops.interfaceExample;

public interface classBB {
	
	 abstract public void shanthi();
	 
	 
	 //From java 8, we can implement the method using deafult method.
      default void Test() {
		System.out.println("This is test");
	}

}
