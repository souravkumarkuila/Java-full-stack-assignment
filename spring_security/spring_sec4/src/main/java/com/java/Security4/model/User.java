package com.java.Security4.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private int id;
	    private String username;
	    private String password;
	    private boolean active;
	    private String roles;
	    
	    public User(){}
	    
		public User(int id, String username, String password, boolean active, String roles, boolean accountNonLocked, int failedAttempt, Date lockTime) {
			super();
			this.id = id;
			this.username = username;
			this.password = password;
			this.active = active;
			this.roles = roles;
			this.accountNonLocked = accountNonLocked;
	        this.failedAttempt = failedAttempt;
	        this.lockTime = lockTime;
		}
		
		@Column(name = "account_no_locker")
	    private boolean accountNonLocked;

	    @Column(name = "failed_attempt")
	    private int failedAttempt;

	    @Column(name = "lock_time")
	    private Date lockTime;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
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

		public boolean isActive() {
			return active;
		}

		public void setActive(boolean active) {
			this.active = active;
		}

		public String getRoles() {
			return roles;
		}

		public void setRoles(String roles) {
			this.roles = roles;
		}

		public boolean isAccountNonLocked() {
			return accountNonLocked;
		}

		public void setAccountNonLocked(boolean accountNonLocked) {
			this.accountNonLocked = accountNonLocked;
		}

		public int getFailedAttempt() {
			return failedAttempt;
		}

		public void setFailedAttempt(int failedAttempt) {
			this.failedAttempt = failedAttempt;
		}

		public Date getLockTime() {
			return lockTime;
		}

		public void setLockTime(Date lockTime) {
			this.lockTime = lockTime;
		}
	       
	    
}
