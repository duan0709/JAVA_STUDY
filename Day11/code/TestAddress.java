package com.duan.day07;

public class TestAddress {
	
	public static void main(String[] args) {
		
		Address add = new Address();
		add.address = "�ൺ";
		add.zipCode = "266000";
		add.print();
		
		Address add1 = new Address("����������","10000");
		add1.print();
	}
	
}
