package com.duan.day08.oop.demo;

import java.util.Scanner;

public class TestCar {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Car c1 = new Car("����","��",100000);
		c1.run();
		c1.show();
		
		Car c2 = new Car("��ʱ��","��",5000000);
		c2.run();
		c2.show();
		
		System.out.println("==============================");
		//�����������飬������������������������
		/*
		Car[] cars;
		cars = new Car[2];
		cars[0] = c1;
		cars[1] = c2;
		*/
		//����¼��
		System.out.println("������ֿ⳵λ����");
		int n = input.nextInt();
		Car[] cars= new Car[n];
		//ѭ��¼��
		for (int i = 0; i < cars.length; i++) {
			//���ַ�ʽ
			//��һ�ַ�ʽ
			Car car = new Car();
			System.out.println("������"+(i+1)+"�ų���"+"������Ʒ�ƣ�");
			car.brand = input.next();
			//�ڶ��ַ�ʽ
			//String brand = input.next();
			System.out.println("������"+(i+1)+"�ų���"+"��������ɫ��");
			car.color = input.next();
			//String color = input.next();
			System.out.println("������"+(i+1)+"�ų���"+"�����ļ۸�");
			car.price = input.nextDouble();
			//double price = input.nextDouble();
			
			//Car car = new Car(brand,color,price);
			//���
			cars[i] = car;
		}
		
		//����
		for (Car car : cars) {
			car.run();
		}
	}
}
