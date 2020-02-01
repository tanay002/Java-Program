package com.AbtsrationAndInterface;

abstract class Banker
{
	abstract void demo();
}
abstract class Cashier extends Banker
{
	abstract void demo2();
}
abstract class Withdrawl extends Cashier
{
	public void memo()
	{
		System.out.println("Withdrawl cash");
	}
}

class Depositor extends Withdrawl
{
	public void demo()
	{
		System.out.println("Deposite Cash");
	}

	public void demo2()
	{
		System.out.println("Deposite cheque");
	}
}
class ThirdParty extends Depositor
{
	public void demo()
	{
		System.out.println("ThirdParty Payment mode");
	}
}
public class AbstractClassTry6 
{
	public static void main(String[] args) 
	{                                             //Jiska Reference Uski Method
		ThirdParty t=new ThirdParty();
		t.demo();
		t.demo2();
		System.out.println("");
		Depositor d=new Depositor();  
		Depositor d1=new ThirdParty();
		d.demo();
		d.demo2();
		System.out.println("");
		Withdrawl w1=new ThirdParty();
		w1.demo();
		w1.demo2();
		System.out.println("");
		Withdrawl w2=new Depositor();
		w2.demo();
		w2.demo2();
		System.out.println("");
		Cashier c=new ThirdParty();
		c.demo();
		c.demo2();
		System.out.println(" ");
		Banker b  =new Depositor();
		b.demo();

	}
}
