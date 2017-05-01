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
	System.out.println(aop.sum(10, 20));
	System.out.println(aop.sub(10, 20));
	
	LogicalOperations lop=null;
	lop=new LogicalOperations();
	System.out.println(lop.Big(10, 20));
	System.out.println(lop.Small(10, 20));

}

}
