package com.duan.day08.oop.bankexample;
/**
 * User类（cardNum、identity、username、password、phoneNum、balance）
 */
public class User {
	//卡号
	private String carNum;
	//身份证号
	private String identity;
	//用户名
	private String username;
	//密码
	private String password;
	//手机号
	private String phoneNum;
	//余额
	private double balance;
	
	//无参构造方法
	public User() {

	}

	//全参构造方法
	public User(String carNum, String identity, String username, String password, String phoneNum, double balance) {
		this.carNum = carNum;
		this.identity = identity;
		this.username = username;
		this.password = password;
		this.phoneNum = phoneNum;
		this.balance = balance;
	}

	//get、set方法
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
