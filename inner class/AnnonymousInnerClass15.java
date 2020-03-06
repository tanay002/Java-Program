package com.InnerClass;
class Popcorn
{
	public void taste()
	{
		System.out.println("Tasteless");
	}
}
public class AnnonymousInnerClass15 extends Popcorn
{
	public static void main(String[] args)
	{
		Popcorn p=new Popcorn()
		{
			public void taste()
			{
				System.out.println("Sweet");
			}
		};
		
		Popcorn p1=new Popcorn()
		{
			public void taste()
			{
				System.out.println("Salty");
			}
		};
		p.taste();
		p1.taste();
	}
}
