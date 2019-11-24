package cn.xyy.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.util.Date;

public class LoggingInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invo) throws Throwable {
        Object[] args = invo.getArguments();
        String date1 = (new Date()).toLocaleString();
        System.out.println("Interceptor信息： [loggingbefore]["+date1 + "]用户 " + args[0] + " 尝试修改个人信息...");
        Object returnObject = invo.proceed();
        String date2 = (new Date()).toLocaleString();
        System.out.println("Interceptor信息：[logging after ]["+date2 +"]用户 "+args[0]+" 成功修改个人信息...");
        return args;
    }
}
