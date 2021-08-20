package com.testProgrammingQuestions;

public class CurrentAccount implements BankAccount{
	
	public void checkBalance(int bal)
	{
		System.out.println("This is current account");
		System.out.println("You balance is: "+bal);
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
