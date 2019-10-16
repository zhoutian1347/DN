package com.tedu.Proxy;

public class SingProxy implements ISinger {
	//用来接收对象，以便调用sing方法
	private ISinger target;
	
	public SingProxy(ISinger target) {
		this.target = target;
	}
	
	@Override
	public void sing() {
		System.out.println("问好");
		target.sing();
		System.out.println("感谢");
	}

}
