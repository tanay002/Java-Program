package com.ThreadTask;

class MyThread6 extends Thread
{	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(this.getName()+" "+i);
		}
	}
}
class MyThreadBack6 extends Thread
{	
	public void run() 
	{
		for(int i=90;i<100;i++)
		{ 
			System.out.println(this.getName()+" "+i);
			
		}
		try
		{
		this.join();
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
public class FirstWay6
{
	public static void main(String[] args)
	{
		MyThread6 mt=new MyThread6();

		MyThreadBack6 mt2=new MyThreadBack6();

		mt.start();
		mt2.start();

	}
}
