package com.nt.test;

import com.nt.mod1.ArithmeticOperation;
import com.nt.mod2.LogicalOperations;

public class SampleApp {
public static void main(String[] args) {
	System.out.println("sample app1");
	System.out.println("sample app2");

	System.out.println("sample app3-->Hello");

	System.out.println("sample app3--->Hello");
	System.out.println("sample app5");
	System.out.println("sample app4");
	
	ArithmeticOperation aop=null;
	 aop= new ArithmeticOperation();
	System.out.println(aop.sum(100, 200));
	System.out.println(aop.sub(100, 200));
	
	
	
	System.out.println(aop.equal(10, 20));
	System.out.println(aop.mul(10, 20));
	

}

}
