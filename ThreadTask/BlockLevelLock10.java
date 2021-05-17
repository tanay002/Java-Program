package com.ThreadTask;
//Object level lock in block level Lock
class Account3
{
	public void deposite(String threadName)
	{
		synchronized (this) 
		{
			System.out.println("This block is synchronized");

			for(int i=90;i<95;i++)
			{
				System.out.println(threadName+" "+i);
			}
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(threadName+" "+i);
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
public class BlockLevelLock10 extends Thread
{
	Account3 ac;
	public BlockLevelLock10(Account3 ac)
	{
		this.ac=ac;
	}
	@Override
	public void run()
	{
		ac.deposite(this.getName());
	}

	public static void main(String[] args) {

		Account3 a=new Account3();

		BlockLevelLock10 ob1=new BlockLevelLock10(a);
		BlockLevelLock10 ob2=new BlockLevelLock10(a);

		ob1.start();
		ob2.start();


	}
}
