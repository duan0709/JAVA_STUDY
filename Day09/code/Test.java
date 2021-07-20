package com.duan.day05;

public class Test {
	// 1、声明数组
	static int[] nums = new int[5];//nums不是静态全局变量，将其变成静态全局变量
	//有效元素个数 利用下标和有效元素个数相等 插入固定位置
	//static int size = 3;
	static int size = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 利用数组完成增删改查

		
		
		//2、赋值
		/*nums[0] = 11;
		nums[1] = 22;
		nums[2] = 33;*/
		insert(0, 11);
		insert(1, 22);
		insert(2, 33);
		
		//遍历方法
		printArray();
		
		insert(3, 44);
		
		//添加方法
		insert(0,88);
		
		
		/*
		int target = search(4);
		System.out.println(target);
		*/
		/*
		replace(0, 100);
		printArray();
		*/
		delete(0);
		printArray();
	}
	//定义一个方法为nums数组添加新值
	public static void insert(int position,int value) {
		//进行扩容
		if (size == nums.length) {
			expand();
		}
		
		//有效位置的判断
		if (position < 0 || position > size) {
			System.out.println("输入位置有误！请输入0~"+size+"之间的值");
			return;
		}
		/*
		//遍历，找到为0的空位置插入进去
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				//找到一个空位置插入
				nums[i] = value;
				break;
			}
			
		}
		*/
		//可以这同样写 保存新值 nums[size++] = value;
		/*
		nums[size] = value;
		size++;
		*/
		//移动元素同时插入值
		for (int i = size; i > position; i--) {
			nums[i] = nums[i-1];
		}
		nums[position] = value;
		size++;
	}
	//扩容的方法
	public static void expand() {
		System.out.println("开始扩容了");
		int [] newNums = new int[nums.length*2];
		System.arraycopy(nums, 0, newNums, 0, nums.length);
		//地址替换
		nums = newNums;
	}
	
	//删除功能（根据对应位置删除对应值，将位置后的值依次向前移）
	public static void delete(int position) {
		//有效位置的判断
		if (position < 0 || position > size) {
			System.out.println("输入位置有误！请输入0~"+size+"之间的值");
			return;
		}
		for (int i = position; i <size - 1; i++) {
			nums[i] = nums[i+1];
		}
		size--;
	}
	
	//替换功能（将原位置的值替换成新值）
	public static void replace(int position,int value) {
		//有效位置的判断
		if (position < 0 || position > size) {
			System.out.println("输入位置有误！请输入0~"+size+"之间的值");
			return;
		}
		nums[position] = value;
	}
	
	//查找功能（通过下标获取对应的值）
	public static int search(int position) {
		
		//有效位置的判断
		if (position < 0 || position > size) {
			System.out.println("输入位置有误！请输入0~"+size+"之间的值");
			return -1;//有问题（-1代表没有对应的下标）暂时处理
		}
		return nums[position];
	}
	
	//遍历数组的方法
	public static void printArray() {
		//3、遍历
				for (int i = 0; i < nums.length; i++) {
					System.out.println(nums[i]+"\t");
				}
				System.out.println();
	}

}
