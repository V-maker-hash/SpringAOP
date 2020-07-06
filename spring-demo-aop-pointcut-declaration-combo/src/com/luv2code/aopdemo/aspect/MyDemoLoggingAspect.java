package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
	//this is where we add all of our related advices for logging
	
	
	//let's start with @Before advice
	
	@Pointcut ("execution(* com.luv2code.aopdemo.dao.*.*(..))")
	public void pointCut() {
		System.out.println("\n======>>> Executing @Before advice on addAccount()");
	}
	
	//create pointcut for getter methods
	
	@Pointcut ("execution(* com.luv2code.aopdemo.dao.*.get*(..))")
	public void getter() {
	}
	
	//create pointcut for setter methods
	
	@Pointcut ("execution(* com.luv2code.aopdemo.dao.*.set*(..))")
	public void setter() {
	}
	
	//create combo pointcut 
	
	@Pointcut ("pointCut() && !(getter() || setter())")
	public void forDaoPackageExcludeGetterAndSetter() {
	}
	
	@Before ("forDaoPackageExcludeGetterAndSetter()")
	public void beforeAddAccountAdvice() {
		System.out.println("\n======>>> Executing @Before advice on method");
	}
	
	@Before ("forDaoPackageExcludeGetterAndSetter()")
	public void performApiAnalytics() {
		System.out.println("\n======>>> Executing perform Api Analytics");
	}

}