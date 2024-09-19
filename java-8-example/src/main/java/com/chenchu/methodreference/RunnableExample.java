package com.chenchu.methodreference;

public class RunnableExample {

	public static void main(String[] args) {
		Runnable r = () -> System.out.println("runnable call");
		new Thread(r).start();
		Runnable r1 = Test::m1;
		new Thread(r1).start();
		Test t = new Test();
		
		Runnable r2 = t::m2;
		new Thread(r2).start();
		
		DemoInter d = s -> new Demo(s);
		d.get("From lambda call");
        
	   DemoInter di = Demo::new;
	   Demo demo = di.get("From constructor reference call");
	}
}

class Test{
	public static void m1() {
		System.out.println("from Method referece static method");
	}
	
	public void m2() {
		System.out.println("from Method referece instance method");

	}
}
class Demo
{
	String s;
	public Demo(String s) {
		System.out.println("construtor called");
		this.s=s;
	}
	
}

interface DemoInter{
	public Demo get(String s);
}
