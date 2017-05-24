/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aspect;

/**
 *
 * @author jiayuan
 */
import org.aspectj.lang.ProceedingJoinPoint;
public class LoggerAspect {
    public Object log(ProceedingJoinPoint joinPoint)throws Throwable{
        System.out.println("start log" + joinPoint.getSignature().getName());
        Object object = joinPoint.proceed();
        System.out.println("end log" + joinPoint.getSignature().getName());
        return object;
    }
}
