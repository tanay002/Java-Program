package com.taskkk;
class Account
{
	public void deposite()
	{
		synchronized (Account.class)
		{
			//------
		}
	
			System.out.println("Deposite");
		
	}
}

public class Thread11 extends Thread
{
	Account acc;
	public Thread11(Account acc)
	{
		this.acc=acc;
	}
	public void run()
	{
		acc.deposite();
	}
	public static void main(String[] args) 
	{
		Account acc=new Account();
		Thread11 t=new Thread11(acc);
		Thread11 t1=new Thread11(acc);
		t.start();
		t1.start();


	}
}
