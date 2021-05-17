package com.ThreadTask;

class MyThread4 implements Runnable
{	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("i"+" "+i);
		}
	}
}
public class FirstWay4 
{
	public static void main(String[] args)
	{
		MyThread4 mt=new MyThread4();
		Thread t=new Thread(mt);
		t.start();

		MyThread4 mt2=new MyThread4();
		Thread t1=new Thread(mt2);
		t1.start();

	}
}
