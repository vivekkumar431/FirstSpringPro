package com.javabaconfi;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JavaConfig {

	@Bean("add")
	public AddressBean getAddressBean() {

		StudentBean stub = new StudentBean(1234, "vivek", "BNCET");
		AddressBean addb = new AddressBean();
		addb.setCity("hyd");
		addb.setHno(654);
		addb.setStdbean(stub);
		return addb;
	}
	@Bean("add1")
	public AddressBean getAddressBean1() {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the stdId/sudName/collName/HNo/city");
       int stdId=sc.nextInt();
       String stdName=sc.next();
       String cName=sc.next();
       int hno=sc.nextInt();
		String city=sc.next();
		StudentBean stub = new StudentBean(stdId,stdName,cName);
		AddressBean addb = new AddressBean();
		addb.setCity(city);
		addb.setHno(hno);
		addb.setStdbean(stub);
		sc.close();
		return addb;
	}

	@Bean("cust")
	public CustomerBean getCustomerBean() {
		CustomerBean cutb = new CustomerBean();
		return cutb;
	}
	@Bean("cust1")
	@Scope("prototype")
	public CustomerBean getCustomerBean1() {
		CustomerBean cutb = new CustomerBean();
		return cutb;
	}

}
