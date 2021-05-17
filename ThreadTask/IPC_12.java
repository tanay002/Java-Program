package com.ThreadTask;


class BankAccount
{ 
	int availableAmount=10000;
	public synchronized void deposite(int amt)
	{
		System.out.println("Amount is going to deposit");
		availableAmount=availableAmount+amt;
		notify();
	}

	public synchronized void withdraw(int amt)
	{
		if(availableAmount<amt)
		{

			try
			{
				System.out.println("Your thread is in waiting condition");
				wait();
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Amount is goint to withdrawl");
	}

}
class Thread1 extends Thread
{
	BankAccount ac;
	public Thread1(BankAccount ac)
	{
	this.ac=ac;	
	}
	public void run()
	{
		ac.deposite(5000);
	}
}

class Thread2 extends Thread
{
	BankAccount ac;
	public Thread2(BankAccount ac)
	{
	this.ac=ac;	
	}
	public void run()
	{
		ac.withdraw(15000);
	}
}
public class IPC_12 
{

	public static void main(String[] args) {

		BankAccount a1=new BankAccount();

		Thread1 t1=new Thread1(a1);
		Thread2 t2=new Thread2(a1);

		t2.start();
		t1.start();
		


	}
}

