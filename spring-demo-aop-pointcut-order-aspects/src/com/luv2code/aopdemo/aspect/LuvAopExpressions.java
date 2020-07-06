package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
public class LuvAopExpressions {

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
}
