package com.apjfsa;

public class ArithmeticAndRelationalOp {
	int a,b;
	int v1,v2;

	void ArithmeticOp() {
		System.out.println("a+b = "+(a+b));
		System.out.println("a-b = "+(a-b));
		System.out.println("a*b = "+(a*b));
		System.out.println("a/b = "+(a/b));
		System.out.println("a%b = "+(a%b));
	}
	
	
	void RelationalOp() {
		System.out.println("v1==v2 = "+(v1==v2));
		System.out.println("v1!=v2 = "+(v1!=v2));
		System.out.println("v1>=v2 = "+(v1>=v2));
		System.out.println("v1<=v2 = "+(v1<=v2));
		System.out.println("v1<v2 = "+(v1>v2));
		
	}
	
	public static void main(String[]args) {
		
		ArithmeticAndRelationalOp obj=new ArithmeticAndRelationalOp();
		obj.a=10;
		obj.b=20;
		obj.ArithmeticOp();
		
		obj.v1=200;
		obj.v2=300;
		obj.RelationalOp();

	}

}
