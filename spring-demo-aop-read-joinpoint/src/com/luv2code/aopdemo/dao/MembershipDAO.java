package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	public void addAccount() {
		System.out.println(getClass() + ": DOING STUFF: ADDING A MEMBERSHIP ACCOUNT");
	}
	
	public boolean goodNight() {
		System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
		return true;
	}
}
