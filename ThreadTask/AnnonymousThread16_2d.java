package com.thread.Annonymous;

class ThreadDemo extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Child Thread");
		}
	}	
}
public class AnnonymousThread16_2d
{
	
	public static void main(String[] args)
	{
		
		ThreadDemo t=new ThreadDemo();
		t.start();

		for(int i=0;i<5;i++)
		{
           System.out.println("Main Thread");
		}
	}
}
