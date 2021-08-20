package com.testProgrammingQuestions;
import java.util.*;

public class MainBankAccount {

	public static void main(String[] args) 
	{
		SavingsAccount savingsaccount = new SavingsAccount();
		CurrentAccount currentaccount = new CurrentAccount();
		Scanner sc = new Scanner(System.in);
		
		// for successful validation of user
		// enter user name as bankUser and password as user123
		System.out.println("Enter username: ");
		String userName = sc.nextLine();
		System.out.println("Enter password: ");
		String pass = sc.nextLine();
		System.out.println("Enter balance: ");
		int balance = sc.nextInt();
		
		//Calling savingsAccount class methods
		System.out.println();
		System.out.println("Details from your savings account: ");
		savingsaccount.validateUSer(userName, pass);
		savingsaccount.checkBalance(balance);
		
		//Calling currentAccount class methods
		System.out.println();
		System.out.println("Details from your current account: ");
		currentaccount.validateUSer(userName, pass);
		currentaccount.checkBalance(balance);
	}

}
