package com.ThreadTask;

import java.util.Date;

//Start time of Thread
class CheckThreaTime extends Thread
{
	public void run() 
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(this.getName()+" "+i);	
		}
	}
	public synchronized void start()
	{
		System.out.println("Start Thread time"+" "+new Date().getTime());
		super.start();
	}


}

public class FirstWay5
{
	public static void main(String[] args) {

		CheckThreaTime  t=new  CheckThreaTime ();
		CheckThreaTime  t2=new  CheckThreaTime();

		t.start();
		t2.start();
	}
}

