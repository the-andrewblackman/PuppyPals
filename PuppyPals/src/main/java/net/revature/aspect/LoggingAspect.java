package net.revature.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("loggingAspect")
@Aspect
public class LoggingAspect {
	
	private Logger logger = LoggerFactory.getLogger("aLogger");
	
	// Controller Methods
	@Pointcut(value = "within(net.revature.controller..*)")
	public void targetControllerMethods() {}
	
	@After(value="targetControllerMethods()")
	public void logAfterControllerMethods(JoinPoint jp) {
		this.logger.debug(jp.getSignature().getName() + "() in the " 
	+ jp.getSignature().getDeclaringType() + " was invoked");
	}
	
}
