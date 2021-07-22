 package com.duan.day07;

public class TestInstanceAndLocal {

	public static void main(String[] args) {
		//数据类型 变量名;
		//变量名 = 值;
		
		//局部变量
		int a = 10;
		System.out.println(a);
 
		Cat cat =new Cat();
		System.out.println(cat.breed);//null
		System.out.println(cat.age);//0
		System.out.println(cat.sex);//null
 
		cat.show();
	}

}
class Cat {
		//实例变量
		String breed;
		int age;
		String sex;
		
		public void show() {
			String breed = "波斯猫";
			System.out.println(breed);
		}
}
 