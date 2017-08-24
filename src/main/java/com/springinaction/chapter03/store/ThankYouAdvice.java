package com.springinaction.chapter03.store;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class ThankYouAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("Thank you, come again!");

	}

}
