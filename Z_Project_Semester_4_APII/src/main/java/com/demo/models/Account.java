package com.demo.models;
// Generated Dec 3, 2021, 10:25:53 PM by Hibernate Tools 5.1.10.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Account generated by hbm2java
 */
@Entity
@Table(name = "account", catalog = "dbproject4")
public class Account implements java.io.Serializable {

	private String accountId;
	private String username;
	private String password;
	private String fullname;
	private String email;
	private Date dob;
	private String addr;
	private boolean gender;
	private String phone;
	private String avatar;
	private boolean status;
	private Set<Role> roles = new HashSet<Role>(0);
	private Set<Pay> pays = new HashSet<Pay>(0);

	public Account() {
	}

	public Account(String accountId, String username, String password, String fullname, String email,Date dob, String addr, boolean gender, String phone, String avatar, boolean status) {
		this.accountId = accountId;
		this.username = username;
		this.password = password;
		this.fullname = fullname;
		this.email = email;
		this.dob = dob;
		this.addr = addr;
		this.gender = gender;
		this.phone = phone;
		this.avatar = avatar;
		this.status = status;
	}

	public Account(String accountId, String roleId, String username, String password, String fullname, String email,
			Date dob, String addr, boolean gender, String phone, String avatar, boolean status, Set<Role> roles,
			Set<Pay> pays) {
		this.accountId = accountId;
		this.username = username;
		this.password = password;
		this.fullname = fullname;
		this.email = email;
		this.dob = dob;
		this.addr = addr;
		this.gender = gender;
		this.phone = phone;
		this.avatar = avatar;
		this.status = status;
		this.roles = roles;
		this.pays = pays;
	}

	@Id

	@Column(name = "account_id", unique = true, nullable = false, length = 50)
	public String getAccountId() {
		return this.accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}


	@Column(name = "username", nullable = false, length = 50)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password", nullable = false, length = 250)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "fullname", nullable = false, length = 100)
	public String getFullname() {
		return this.fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	@Column(name = "email", nullable = false, length = 100)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dob", nullable = false, length = 10)
	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Column(name = "addr", nullable = false, length = 250)
	public String getAddr() {
		return this.addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Column(name = "gender", nullable = false)
	public boolean isGender() {
		return this.gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	@Column(name = "phone", nullable = false, length = 20)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "avatar", nullable = false, length = 65535)
	public String getAvatar() {
		return this.avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	@Column(name = "status", nullable = false)
	public boolean isStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "account_role", catalog = "dbproject4", joinColumns = {
			@JoinColumn(name = "account_id", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "role_id", nullable = false, updatable = false) })
	public Set<Role> getRoles() {
		return this.roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "account")
	public Set<Pay> getPays() {
		return this.pays;
	}

	public void setPays(Set<Pay> pays) {
		this.pays = pays;
	}

}
