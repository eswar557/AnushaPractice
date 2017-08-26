package com.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	//1a. Around - Before
	//1b. Before
	//2a. actual method
	//2b. Around - After
	//3. After
	//4. After return(if it is successful)
	//5. After throwing(if exception occurred)
	
	
	@AfterReturning("execution(void com.spring.core..set*(..))")
	public void afterReturnSetMethodLogger(JoinPoint joinPoint) {
		System.out.println("After Return: " + joinPoint.getSignature().getName() + " on Object:" + joinPoint.getTarget());
	}
	
	@Before("execution(void com.spring.core..set*(..))")
	public void beforeSetMethodLogger(JoinPoint joinPoint) {
		System.out.println("Before: " + joinPoint.getSignature().getName() + " on Object:" + joinPoint.getTarget());
	}
	
	@After("execution(void com.spring.core..set*(..))")
	public void afterSetMethodLogger(JoinPoint joinPoint) {
		System.out.println("After: " + joinPoint.getSignature().getName() + " on Object:" + joinPoint.getTarget());
	}
	
	@AfterThrowing("execution(void com.spring.core..set*(..))")
	public void afterThrowingSetMethodLogger(JoinPoint joinPoint) {
		System.out.println("After throwing: " + joinPoint.getSignature().getName() + " on Object:" + joinPoint.getTarget());
	}
	

	
	@Around("execution(void com.spring.core..set*(..))")
	public void aroundSetMethodLogger(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("Before Around:" + joinPoint);
		Object[] args = joinPoint.getArgs();
		String arg = args[0].toString();
		if(arg.equals("Jai ho"))
			joinPoint.proceed();
		System.out.println("After Around:" + joinPoint);
	}
	
	@Around("execution(String com.spring.core.Song.get*(..))")
	public Object aroundgetMethodLogger(ProceedingJoinPoint a) throws Throwable {
		Object val = a.proceed();
		return val.toString();
	}
}
