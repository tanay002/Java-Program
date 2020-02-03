package com.AbstrationAndInterface;
//Mutilevel Inteface
interface Alphaa
{
	public static final int i=10;
	public void demo();
}
interface Betta extends Alphaa
{
	int j=20;	
	int i=15;
	public void show();
}
public class Interface6 implements Betta
{
	public void demo() 
	{
		System.out.println("demo");
	}

	public void show()
	{
		System.out.println("show");	
	}

	public static void main(String[] args)
	{
		Betta in=new Interface6();
		in.demo();
		in.show();
		Alphaa ap=new Interface6();
		ap.demo();
		System.out.println(i); //
	}
               
}
