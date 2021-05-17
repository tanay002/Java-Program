package com.ThreadTask;

class MyThread3 extends Thread
{	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(this.getName()+" "+i);
		}
	}
}
public class FirstWay3 
{
	public static void main(String[] args)
	{
		MyThread3 mt=new MyThread3();
		mt.start();

		MyThread3 mt2=new MyThread3();
		mt2.start();
	}
}
