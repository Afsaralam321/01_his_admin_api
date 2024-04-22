package com.afsar.service;

import java.util.List;

import com.afsar.bindings.UserAccForm;

public interface AccountService {
	
	public String createUserAccount(UserAccForm accForm);
	
	public List<UserAccForm> fetchUserAccounts();
	
	public UserAccForm getUserAccById(Integer accId);

}
