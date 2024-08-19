package com.aug19;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

//		A obj1 = new A();
//		double result = obj1.m1();
//		System.out.println(result);
		
//		B b1 = new B();
//		
//		A obj1 = b1.m2();
//		
//		double result = obj1.m1();
		
//		double r = new B().m2().m1();
//		double r = new C().m3().m2().m1();
		
		A a1 = new A();
		System.out.println(new C().m3().m2().p + new C().m3().q + new C().r);

						
		Scanner sc = new Scanner(System.in);
		
		
		C c1 = new C();
		String r1 = c1.r;
		
		String r2	= c1.m3().q;
		
		String r3	= c1.m3().m2().p;
		
		
		 String xxx = c1.m3().m2().p;
		 
		 B obj = c1.m3();
		 
		 A obj2 = c1.m3().m2();
		 
		 	double newresult = c1.m3().m2().m1();
		
		
		C objc = new C();
		objc.m3().m2().p;
		
		new A().p;
		new B().m2();
	}

}
