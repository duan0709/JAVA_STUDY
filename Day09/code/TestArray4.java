package com.duan.day05;

public class TestArray4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//数组的默认值及其创建方式
		//第一种：声明并分配空间
		//数据类型[] 数组名 = new 数据类型[长度];
		int [] nums=new int[5];
		//int  nums []=new int[5];
				//遍历数组
				System.out.println("通过for循环遍历数组：");
				for(int i=0;i<nums.length;i++){
					System.out.print(nums[i]+"\t");
				}
				System.out.println();
				System.out.println("通过增强for循环遍历数组：");
				for(int num :nums){
					System.out.print(num+"\t");
				}
				System.out.println();
				//第二种方式
				//声明数组
				//分配空间
				//数据类型 [] 数组名; 或者 数据类型 数组名[];
				//数组名=new 数据类型 [长度];
				double[] scores;
				scores=new double[5];
				System.out.println("通过增强for循环遍历数组：");
				for(double score :scores){
					System.out.print(score+"\t");
				}
				System.out.println();
				
				//第三种方式：声明分配空间并赋值
				//数据类型 [] 数组名=new 数据类型 []{value1,value2,value3,....};
				//char [] chs=new char[]{'A','B','C','D'};
				char [] chs;
				chs=new char[]{'A','B','C','D'};
				System.out.println("通过增强for循环遍历数组：");
				for(char c:chs){
					System.out.print(c+"\t");
				}
				System.out.println();
				
				//第四种方式：声明分配空间并赋值（简写）  不能分开写
				//String [] names=new String[5];
				String [] names={"tom","jack"};
				System.out.println("通过增强for循环遍历数组：");
				for(String name:names){
					System.out.print(name+"\t");
				}
				System.out.println();
	}

}
