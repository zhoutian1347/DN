package com.tedu.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Sss {
	public static void main(String[] args) {
		ISinger target = new Singer();
//		ISinger proxy = new SingProxy(target);
//		proxy.sing();
		
		
		ISinger proxy = (ISinger) Proxy.newProxyInstance(target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), 
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("问好");
						Object returnValue = method.invoke(target, args);
						System.out.println("感谢");
						return returnValue;
					}
				});
		proxy.sing();
	}
}
