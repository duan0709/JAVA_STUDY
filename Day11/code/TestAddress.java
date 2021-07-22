package com.duan.day07;

public class TestAddress {
	
	public static void main(String[] args) {
		
		Address add = new Address();
		add.address = "青岛";
		add.zipCode = "266000";
		add.print();
		
		Address add1 = new Address("北京东城区","10000");
		add1.print();
	}
	
}
