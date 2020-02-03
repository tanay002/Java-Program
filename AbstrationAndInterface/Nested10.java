package com.AbstrationAndInterface;
//Abstract class inside interface
interface Company
{
	abstract class Mnc
	{
		public abstract void details1();
	}
}

/*interface Company2       
{
	abstract class NonMnc
	{
      public abstract void details2();
	}
}*/

public class Nested10 extends Company.Mnc  //,Company2.NonMnc        (Can't extends multiple Nested Class)
{
	public void details1()
	{
		System.out.println("Mnc Company");
	}
	public static void main(String[] args) 
	{
		Company.Mnc m=new Nested10();	
		m.details1();
	}
}
