package com.ThreadTask;
class Account
{
	public synchronized void deposite()
	{
		for(int i=0;i<6;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
public class ObjectLevelLock8 extends Thread
{
	Account ac;
	public ObjectLevelLock8(Account ac)
	{
		this.ac=ac;
	}
	@Override
	public void run()
	{
		ac.deposite();
	}

	public static void main(String[] args) {

		Account a=new Account();

		ObjectLevelLock8 ob1=new ObjectLevelLock8(a);
		ObjectLevelLock8 ob2=new ObjectLevelLock8(a);

		ob1.start();
		ob2.start();
	}
}
