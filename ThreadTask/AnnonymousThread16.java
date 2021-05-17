package com.thread.Annonymous;
//Annonymous inner class thar extends a class
public class AnnonymousThread16 extends Thread
{
	public static void main(String[] args) 
	{
		Thread t =new Thread()
		{
			public void run()
			{
				for(int i=0;i<2;i++)
				{
					System.out.println("Child Thread");
				}

			}
		};
		t.start();
		for(int i=0;i<2;i++)
		{
			System.out.println("MainThread");
		}
	}
}