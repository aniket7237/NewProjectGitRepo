package com.test;

public class B extends A{
	B(int x){
		//super();
		System.out.println(x);
	}
	
	public void b1() {
		System.out.println("Method b1 From Class B");
	}
//	public void a1() {
//		System.out.println("Method a1 From Class B");
//	 System.out.println();
//	}
	public void m2() {
		System.out.println("Class B with m2");
	}
	public void m1() {
		System.out.println("class B with m1");
	}
	
	public static void main(String[] args) {
		
//		B b =new B(5);
//		b.a1();
//		b.b1();
//		b.m1();
//		b.m2();
		
		A a= new B(5);
		a.a1();
//		a.m1();
//		a.m2();
		//a.b1();
		//B b = (B) new A();
		

	}

}
