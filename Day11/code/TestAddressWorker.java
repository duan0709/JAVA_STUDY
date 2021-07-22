package com.duan.day07;

public class TestAddressWorker {
	
	public static void main(String[] args) {
		Worker worker = new Worker("zhangsan",25,2500);
		worker.print();
		Address addr = new Address("北京市海淀区清华园1号","100084");
		addr.print();
	}
}
