package com.testProgrammingQuestions;

public class SavingsAccount implements BankAccount {

	@Override
	public void checkBalance(int bal) {
		// TODO Auto-generated method stub
		System.out.println("Bank balance is: "+bal);
	}

	@Override
	public void validateUSer(String username, String password) {
		// TODO Auto-generated method stub
		
		String pwd = "user123";
		String uname = "bankUser";
		
		if(uname.equals(username) && pwd.equals(password))
			System.out.println("User validated successfully, Thank You!");
		else
			System.out.println("Failed to validate user!");
	}

}
