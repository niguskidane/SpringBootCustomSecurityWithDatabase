package com.nk.springbootsecuritywithdatabase.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="users")
public class UserInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="username",length=50,nullable=false)
	private String userName;
	
	@Column(name="password",length=800,nullable=false)
	private String password;
	

	
	@Column(name="full_name",length=100)	
	private String fullName;

    @Column(name="role",length=50)
    private String role;
	
	@Column(name="country",length=30)	
	private String country;
	
	@Column(name="enabled")	
	private int enabled;


    public UserInfo() {
    }

    public UserInfo(String userName, String password, String fullName, String role, String country, int enabled) {
        this.userName = userName;
        this.password = password;
        this.fullName = fullName;
        this.role = role;
        this.country = country;
        this.enabled = enabled;
    }

    public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getEnabled() {
		return enabled;
	}
	public void setEnabled(short enabled) {
		this.enabled = enabled;
	}
}
