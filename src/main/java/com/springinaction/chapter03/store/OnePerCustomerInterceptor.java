package com.springinaction.chapter03.store;

import java.util.HashSet;
import java.util.Set;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;



public class OnePerCustomerInterceptor implements MethodInterceptor {

	private Set<Customer> customers = new HashSet<Customer>();
	

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		Customer cust = (Customer) invocation.getArguments()[0];
		if (customers.contains(cust)) {
			System.out.println("One per customer, "+cust.getName()+"!");
			return null;
		}
		else {
			Object s = invocation.proceed();
			customers.add(cust);
			return s;
		}
		
		
	}

}
