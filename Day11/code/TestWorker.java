package com.duan.day07;

public class TestWorker {
	public static void main(String[] args) {
		
		Worker work1 = new Worker();
		work1.name = "光头强";
		work1.age = 18;
		work1.salary = 1;
		work1.print();
		
		Worker work2 = new Worker("李员工",20,5.5);
		work2.print();
		
		work1.work(8);
		
	}
}
