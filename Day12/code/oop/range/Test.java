package com.duan.day08.oop.range;

public class Test {
	public void show() {
		TestSelfClass t = new TestSelfClass();
		//同包下，除private都可见
		//System.out.println(t.a);
		System.out.println(t.b);
		System.out.println(t.c);
		System.out.println(t.d);
	}
}
