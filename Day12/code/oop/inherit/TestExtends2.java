package com.duan.day08.oop.inherit;

public class TestExtends2 {
	public static void main(String[] args) {
		Car car = new Car();
		car.brand = "����";
		car.price = 300000;
		car.speed = 120;
		System.out.println("����һ��"+car.brand+"Ʒ�Ƶ�����������"+car.speed+"km/s���ٶ���ʻ");
		
		Bus bus = new Bus();
		bus.seatNum = 8;
		bus.price = 1000000;
		bus.speed = 80;
		System.out.println("����һ��"+bus.seatNum+"���Ĺ�����������"+bus.speed+"km/s���ٶ���ʻ");
		
	}
}
//���� ��ͨ������
class Vehicle{
	double price;
	int speed;
	public void run() {
		System.out.println("��ʻ��...");
	}
}
//����
class Car extends Vehicle{
	String brand;//Ʒ��
}
//����
class Bus extends Vehicle{
	int seatNum;//��λ��
}
//����
class Bicycle extends Vehicle{
	String color;
}