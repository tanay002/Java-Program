package com.AbtsrationAndInterface;

abstract class Bank
{ 
	private int bankAmt;
	
	public int getBankAmt() {
		return bankAmt;
	}
	
	Bank(int bankAmt)
	{
		this.bankAmt=bankAmt;
	}
	public abstract void checkName();	
}

class SBI extends Bank
{
	SBI(int a)
	{
		super(a);
	}
	public void checkName()
	{    
		Bank a=null;
		System.out.println("SBI Branch "+getBankAmt());
	}
}

class BOB extends Bank
{
	BOB(int a)
	{
		super(a);
	}

	public void checkName()
	{
		Bank a=null;
		System.out.println("Bob Branch "+getBankAmt());
	}
}

public class AbstractClassExample4 
{
	public static void main(String[] args) 
	{
		Bank b=new SBI(1000);
		b.checkName();
		Bank b1=new BOB(500);
		b1.checkName();
	}
}
