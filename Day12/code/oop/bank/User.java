package com.duan.day08.oop.bank;
/**
 * User�ࣨcardNo��identity��username��password��phone��balance��
 */
public class User {
	//����
	private String cardNo;
	//���֤��
	private String identity;
	//�û���
	private String username;
	//����
	private String password;
	//�ֻ���
	private String phone;
	//���
	private String balance;
	
	//�޲ι���
	public User() {
		
	}
	//ȫ�ι���
	public User(String cardNo, String identity, String username, String password, String phone, String balance) {
		super();
		this.cardNo = cardNo;
		this.identity = identity;
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.balance = balance;
	}
	//get��set����
	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}
	
	
}
