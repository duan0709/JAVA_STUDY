package com.duan.day05;

public class TestArray4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����Ĭ��ֵ���䴴����ʽ
		//��һ�֣�����������ռ�
		//��������[] ������ = new ��������[����];
		int [] nums=new int[5];
		//int  nums []=new int[5];
				//��������
				System.out.println("ͨ��forѭ���������飺");
				for(int i=0;i<nums.length;i++){
					System.out.print(nums[i]+"\t");
				}
				System.out.println();
				System.out.println("ͨ����ǿforѭ���������飺");
				for(int num :nums){
					System.out.print(num+"\t");
				}
				System.out.println();
				//�ڶ��ַ�ʽ
				//��������
				//����ռ�
				//�������� [] ������; ���� �������� ������[];
				//������=new �������� [����];
				double[] scores;
				scores=new double[5];
				System.out.println("ͨ����ǿforѭ���������飺");
				for(double score :scores){
					System.out.print(score+"\t");
				}
				System.out.println();
				
				//�����ַ�ʽ����������ռ䲢��ֵ
				//�������� [] ������=new �������� []{value1,value2,value3,....};
				//char [] chs=new char[]{'A','B','C','D'};
				char [] chs;
				chs=new char[]{'A','B','C','D'};
				System.out.println("ͨ����ǿforѭ���������飺");
				for(char c:chs){
					System.out.print(c+"\t");
				}
				System.out.println();
				
				//�����ַ�ʽ����������ռ䲢��ֵ����д��  ���ֿܷ�д
				//String [] names=new String[5];
				String [] names={"tom","jack"};
				System.out.println("ͨ����ǿforѭ���������飺");
				for(String name:names){
					System.out.print(name+"\t");
				}
				System.out.println();
	}

}
