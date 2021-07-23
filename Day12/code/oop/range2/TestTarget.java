package com.duan.day08.oop.range2;

import com.duan.day08.oop.range.TestSelfClass;;

public class TestTarget extends TestSelfClass{
	
	public void m1() {
		System.out.println(this.c);
		System.out.println(this.d);
	}
	
	
	public void show() {	
		TestSelfClass t = new TestSelfClass();
		System.out.println(t.d);
	}
}
