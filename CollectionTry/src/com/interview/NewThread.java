package com.interview;

public class NewThread extends Thread
{
	public NewThread()
	{
		start();
	}

	public void run()
	{

		System.out.println("Good");
	}

	public static void main(String[] args) 
	{
    NewThread n=new NewThread();
	}

}
