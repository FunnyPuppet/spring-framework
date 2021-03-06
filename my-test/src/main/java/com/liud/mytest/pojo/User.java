package com.liud.mytest.pojo;

/**
 * @Author: liud
 * @Description: TODO
 * @Date: 2021/12/10 9:07
 */
public class User implements java.io.Serializable{
	private Integer id;
	private String userName;
	private String idNo;
	private String phone;
	private String email;

	public User() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", userName='" + userName + '\'' +
				", idNo='" + idNo + '\'' +
				", phone='" + phone + '\'' +
				", email='" + email + '\'' +
				'}';
	}

	private void init() {
		System.out.println("User对象初始化...");
	}
}
