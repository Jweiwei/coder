package com.weiwei.coder.demo.model;

import java.io.Serializable;

public class DemoUser implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5631768011652180662L;
	private Long userId;
	private String userName;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String toString() {
		return "DemoUser [userId=" + userId + ", userName=" + userName + "]";
	}

}
