package com.duan.day08.oop.bankexample;
/**
 * User�ࣨcardNum��identity��username��password��phoneNum��balance��
 */
public class User {
	//����
	private String carNum;
	//���֤��
	private String identity;
	//�û���
	private String username;
	//����
	private String password;
	//�ֻ���
	private String phoneNum;
	//���
	private double balance;
	
	//�޲ι��췽��
	public User() {

	}

	//ȫ�ι��췽��
	public User(String carNum, String identity, String username, String password, String phoneNum, double balance) {
		this.carNum = carNum;
		this.identity = identity;
		this.username = username;
		this.password = password;
		this.phoneNum = phoneNum;
		this.balance = balance;
	}

	//get��set����
	public String getCarNum() {
		return carNum;
	}

	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public  double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
