package com.nk.springbootsecuritywithdatabase.dao;

import com.nk.springbootsecuritywithdatabase.model.UserInfo;

public interface UserInfoDAO {
	public abstract UserInfo getActiveUser(String userName);
}