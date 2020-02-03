package com.AbstrationAndInterface;
  //Interface inside interface,we can implements multiple inner interface
interface Team1
{ 
  int i=10;
	interface India_A
	{
		public abstract void squad();
	}
}

interface Team2
{
	interface India_B
	{   public abstract void squad();
	public abstract void squad2();
	}
}


public class Nested11 implements Team1.India_A ,Team2.India_B
{
	public void squad()
	{
		System.out.println("Squad1");
	}

	public void squad2()
	{
		System.out.println("Squade2");
	}
	
	public static void main(String[] args) 
	{
		Team1.India_A t=new Nested11();	
		t.squad();

		Team2.India_B t1=new Nested11();	
		t1.squad2();

		Nested11 n=new Nested11();
		n.squad();
		n.squad2();
	}
}
