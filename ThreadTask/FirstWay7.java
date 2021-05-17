package com.ThreadTask;

class MyThread7 extends Thread
{	
	public void run()
	{
			System.out.println(this.getState());
		
	}
}

public class FirstWay7
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		MyThread7 mt=new MyThread7();
      System.out.println(mt.getState());

		mt.start();

	
	}
}
