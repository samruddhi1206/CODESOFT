package codesoft.tasks;

import java.util.Scanner;

/*
 * TASK 3 : ATM INTERFACE
 */

public class Task3 
{
	public static void main(String[] args)
	{
		ATM atm = new ATM();
		atm.atmTransaction();
	}
}
class UserAccount
{
	Scanner s = new Scanner(System.in);
	float acBalance;
	public UserAccount(float initialBalance)
	{
		this.acBalance = initialBalance;
	}
	public void deposite()
	{
		System.out.print("Enter Deposite Amount : ");
		float deposite = s.nextFloat();
		if(deposite > 0)
		{
			acBalance = acBalance + deposite; 
			System.out.println("Deposite Succesfully...!");
		}
		else
		{
			System.out.println("Invalid Entry..!  Please enter amount greater than 0.");
		}
	}
	public void withdraw()
	{
		System.out.print("Enter Withdraw Amount : ");
		float withdraw = s.nextFloat();
		if(withdraw > 0)
		{
			if(withdraw <= acBalance)
			{
				acBalance = acBalance - withdraw;
				System.out.println("Withdraw Succesfully...!");
			}
			else
			{
				System.out.println("Low Balance");
			}
		}
		else
		{
			System.out.println("Invalid Entry..!  Please enter amount greater than 0.");
		}
	}
	public void checkBalance()
	{
		System.out.println("Total Balance : "+acBalance);
	}
}
class ATM 
{
	UserAccount u = new UserAccount(1200);
	Scanner sc = new Scanner(System.in);
	public void atmTransaction()
	{
		System.out.println("Enter 1 for Deposite Amount");
		System.out.println("Enter 2 for  Withdraw Amount");
		System.out.println("Enter 3 for Check Balance");
		System.out.println("Enter any key for Exit");
		
		while(true)
		{
			System.out.println("--------------------------------------------------");
			System.out.print("Enter Choice : ");
			int ch = sc.nextInt();
			if(ch == 1)
			{
				u.deposite();
			}
			else if(ch == 2)
			{
				u.withdraw();
			}
			else if(ch == 3)
			{
				u.checkBalance();
			}
			else
			{
				System.out.println("THANK YOU...!");
				break;
			}
		}
	}
}
