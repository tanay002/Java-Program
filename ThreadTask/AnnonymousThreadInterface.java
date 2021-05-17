package com.thread.Annonymous;

class A implements Runnable
{
	public void run()
	{
		for(int i=0;i<2;i++)
		{
			System.out.println("child");
		}
	}
}
public class AnnonymousThreadInterface 
{
	public static void main(String[] args)
	{
		A a=new A();
		Thread t=new Thread(a);
		t.start();
		for(int i=0;i<2;i++)
		{
			System.out.println("childThread");
		}
	}
}
