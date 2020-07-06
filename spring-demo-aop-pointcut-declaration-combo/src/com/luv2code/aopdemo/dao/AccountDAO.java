package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Component
public class AccountDAO {
	
	private String accountName;
	
	private String serviceCode;
	
	
	public String getAccountName() {
		System.out.println(getClass() + " in getAccountName()");
		return accountName;
	}

	public void setAccountName(String accountName) {
		System.out.println(getClass() + " in setAccountName()");
		this.accountName = accountName;
	}

	public String getServiceCode() {
		System.out.println(getClass() + " in getServiceCode()");
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println(getClass() + " in setServiceCode()");
		this.serviceCode = serviceCode;
	}

	public void addAccount(Account acc, boolean b) {
		System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
	}
	
	public int addAccount() {
		System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
		return 0;
	}
}
