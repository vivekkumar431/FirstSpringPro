package com.javabaconfi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
    //Create AddressBean reference with static value
		AddressBean addr = (AddressBean) ctx.getBean("add");
		System.out.println("static Value  =  "+addr);
		//Create AddressBean reference with Dynamic Value
		AddressBean addr2 = (AddressBean) ctx.getBean("add1");
		System.out.println("Dynamic Value  =  "+addr2);
		/*
		 * There are 5 @scope Annotation Method
		 * 1.@scope("singleton")
		 * 2.@scope("prototype")//  First and Second using for creating standelone Application
		 * 3.@scope("request")
		 * 4.@scope("session")
		 * 5.@scope("global-session")
		 * */
		//Create CutomerBean reference  with same Address Path that means without @scope or with singleton @scope
		CustomerBean cutb = (CustomerBean) ctx.getBean("cust");
		CustomerBean cutb1 = (CustomerBean) ctx.getBean("cust");
		System.out.println("find same Address1  =  "+cutb);
		System.out.println("find same Address2  =  "+cutb1);
		//Create CutomerBean reference  with Difference Address Path using @scope Annotation with prototype
		CustomerBean cut = (CustomerBean) ctx.getBean("cust1");
		CustomerBean cut1 = (CustomerBean) ctx.getBean("cust1");
		System.out.println("find Differ add  =  "+cut);
		System.out.println("find Diff add  =  "+cut1);

	}

}
