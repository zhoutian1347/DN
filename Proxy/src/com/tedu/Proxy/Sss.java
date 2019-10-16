package com.tedu.Proxy;

public class Sss {
	public static void main(String[] args) {
		ISinger target = new Singer();
		ISinger proxy = new SingProxy(target);
		proxy.sing();
	}
}
