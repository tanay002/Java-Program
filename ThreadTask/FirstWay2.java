package com.ThreadTask;

class MyThread2 implements Runnable
{	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("i "+i);
		}
	}
}
public class FirstWay2
{
	public static void main(String[] args)
	{
       MyThread2 mt=new MyThread2();
       Thread t=new Thread(mt);
       t.start();
	}
}
