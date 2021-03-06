package com.springboot.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
	
	@Pointcut("execution(* com.springboot.dao.*.*(..))")
	public void dataLayerExecution(){}
	
	@Pointcut("execution(* com.springboot.business.*.*(..))")
	public void businessLayerExecution(){}
	
	@Pointcut("dataLayerExecution() && businessLayerExecution()")
	public void allLayerExecution(){}
	
	@Pointcut("bean(*dao*)")
	public void beanContainingDao(){}
	
	@Pointcut("within(com.springboot.dao..*)")
	public void dataLayerExecutionWithWithin(){}

	@Pointcut("@annotation(com.springboot.aspect.TrackTime)")
	public void trackTimeAnnotation(){}

}