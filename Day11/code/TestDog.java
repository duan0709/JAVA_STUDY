package com.duan.day07;
/**
 * 测试类
 */
public class TestDog {

	public static void main(String[] args) {
		//数据类型 变量名 = 值;
		//1、创建了Dog类的对象，并将其存储在dog1变量中
		Dog dog1 = new Dog();
		
		//2、访问属性
		//对象名.属性名 = 值; 赋值
		dog1.breed = "萨摩";
		dog1.age = 2;
		dog1.sex = "公";
		dog1.furClolor = "白色";
		dog1.num = 007;
		
		//3、访问属性 取值
		//对象名.属性名
		System.out.println(dog1.breed + "\t" + dog1.age + "\t" +dog1.sex + "\t" +dog1.furClolor + "\t" +dog1.num + "\t");
		
		//4、访问方法
		//对象名.方法名
		dog1.eat();		
		dog1.sleep();
		
		
		
		
		//创建第二个Dog类对象
		Dog dog2 = new Dog();
		
		//赋值
		dog2.breed = "田园犬";
		dog2.age = 1;
		dog2.sex = "公";
		dog2.furClolor = "黑白";
		dog2.num = 996;
		
		//访问属性 输出
		System.out.println(dog2.breed + "\t" + dog2.age + "\t" + dog2.sex + "\t" + dog2.furClolor + "\t" + dog2.num + "\t");
		
		
		//访问方法 行为
		dog2.eat();
		dog2.sleep();
		
	}

}
