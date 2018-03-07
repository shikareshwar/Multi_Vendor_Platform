package com.vendor.demo.services;

import com.vendor.demo.beans.UserBean;

public class UserService {

	public UserBean findUserMobileNo(Long mobileNo) {
		UserBean userBean = new UserBean();
		userBean.setUserId(2L);
		userBean.setMobileNo(7000168199L);
		userBean.setFirstName("Tarun");
		userBean.setLastName("Gupta");
		return userBean;
	}
}
