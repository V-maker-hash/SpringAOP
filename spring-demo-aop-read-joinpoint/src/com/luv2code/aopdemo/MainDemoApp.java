package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		
		//read Spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get the bean from Spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		
	
		//call the business method
		// call the business method
				Account myAccount = new Account();
				myAccount.setName("Madhu");
				myAccount.setLevel(2);

		theAccountDAO.addAccount(myAccount, true);
		
		//call the accountDAO getter and setter methods
		theAccountDAO.setAccountName("foobar");
		theAccountDAO.setServiceCode("service code");
		
		
		String name = theAccountDAO.getAccountName();
		String service  = theAccountDAO.getServiceCode();
		
		//get the bean from Spring container
				MembershipDAO theMembershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
				
				//call the business method
				theMembershipDAO.addAccount();
				theMembershipDAO.goodNight();
		
		//close the context
		context.close();
	}
}
