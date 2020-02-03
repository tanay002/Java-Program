package com.AbstrationAndInterface;
//Interface inside abstract class
abstract class Upper
{
	interface Lower
	{
		public abstract void demo();
	}

}

public class Nested8 implements Upper.Lower
{
	public void demo()
	{
		System.out.println("Demo");
		
	}
	public static void main(String[] args)
	{
     Upper.Lower ul=new Nested8();
     ul.demo();
	}
}
