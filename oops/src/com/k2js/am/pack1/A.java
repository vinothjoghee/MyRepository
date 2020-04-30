package com.k2js.am.pack1;

public class A {
 private void method_private() {
	 System.out.println("A class private method");
 }
 
 void method_default() {
	 System.out.println("A class default method");
 }
 protected void method_protected(){
	 System.out.println("A is a protected method");
 }
 public void method_public(){
	 System.out.println("A is a public method");
 }
 
 public static void main(String[] args) {
	A a =new A();
	a.method_private();
	a.method_default();
	a.method_protected();
	a.method_public();
}
 }
 
