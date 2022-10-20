package com.medicare.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
	@Id
	private String email;
	private String name;
	private Long mobile;
	private String password;
	@Column(name="typeofuser")
	private String typeOfUser;
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the moblie
	 */
	
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the typeOfUser
	 */
	public String getTypeOfUser() {
		return typeOfUser;
	}
	/**
	 * @param typeOfUser the typeOfUser to set
	 */
	public void setTypeOfUser(String typeOfUser) {
		this.typeOfUser = typeOfUser;
	}
	@Override
	public String toString() {
		return "Account [email=" + email + ", name=" + name + ", mobile=" + mobile + ", password=" + password
				+ ", typeOfUser=" + typeOfUser + "]";
	}
	

}

