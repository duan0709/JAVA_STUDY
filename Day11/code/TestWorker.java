package com.duan.day07;

public class TestWorker {
	public static void main(String[] args) {
		
		Worker work1 = new Worker();
		work1.name = "��ͷǿ";
		work1.age = 18;
		work1.salary = 1;
		work1.print();
		
		Worker work2 = new Worker("��Ա��",20,5.5);
		work2.print();
		
		work1.work(8);
		
	}
}
