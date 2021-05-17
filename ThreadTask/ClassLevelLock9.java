package com.ThreadTask;
class Account2
{
	public synchronized static void deposite()
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
public class ClassLevelLock9 extends Thread
{
	Account2 ac;
	public ClassLevelLock9(Account2 ac)
	{
		this.ac=ac;
	}
	@Override
	public void run()
	{
		ac.deposite();
	}
	public static void main(String[] args) {

		Account2 a=new Account2();
		Account2 a1=new Account2();

		ClassLevelLock9 ob1=new ClassLevelLock9(a);
		ClassLevelLock9 ob2=new ClassLevelLock9(a1);

		ob1.start();
		ob2.start();
	}
}
