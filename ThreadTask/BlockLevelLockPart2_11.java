package com.ThreadTask;
//CLass level lock in block level Lock

class Account4
{
	public void deposite(String threadName)
	{
		synchronized (Account4.this) 
		{
			System.out.println("This block is synchronized");

			for(int i=90;i<95;i++)
			{
				System.out.println(threadName+" "+i);

			}

		}
	/*	for(int i=0;i<5;i++)
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
		*/
	}

}
public class BlockLevelLockPart2_11 extends Thread
{
	Account4 ac;
	public BlockLevelLockPart2_11(Account4 ac)
	{
		this.ac=ac;
	}
	@Override
	public void run()
	{
		ac.deposite(this.getName());

	}

	public static void main(String[] args) {

		Account4 a=new Account4();
		
		Account4 a1=new Account4();

		BlockLevelLockPart2_11 ob1=new BlockLevelLockPart2_11(a);
		BlockLevelLockPart2_11 ob2=new BlockLevelLockPart2_11(a1);

		ob1.start();
		ob2.start();


	}
}
