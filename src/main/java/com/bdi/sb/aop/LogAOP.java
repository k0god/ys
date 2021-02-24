package com.bdi.sb.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Aspect
@Slf4j
public class LogAOP {
	@Before("execution(public String com.bdi.sb.controller..*())")
	public void before(JoinPoint jp) {
		log.info("before aop1");
	}

	@After("execution(public String com.bdi.sb.controller..*())")
	public void after(JoinPoint jp) {
		log.info("after aop1");
	}
	@Around("execution(public String com.bdi.sb.controller..*())")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		Object obj = pjp.proceed();
		log.info("around aop1");
		return obj;
	}
}
