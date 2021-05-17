package com.constructor;
class Alpha1
{ int k;
	static int i;
	{
		System.out.println("Hello");
	}
	static
	{
		i=20;
		/* k=20   Cannot access non static member for static block  <-incorrect way*/
		 /*Alpha1 a=new Alpha1();     <- correct way
		a.k=20;  */
		
	}
	{
		k=10;
		System.out.println("wao");
		
	}
	Alpha1()
	{
		//this(10);
		System.out.println("done");
	}
		Alpha1(int i)
		{
			System.out.println("para");
		}
}

class Beta1 extends Alpha1
{
	{
		System.out.println("Hello2");
	}	
	{
		System.out.println("wao2");
		
	}
	Beta1()
	{   //super(10);
		System.out.println("done2");
	}
}
public class Block2
{
public static void main(String[] args) {
	 Beta1 b=new Beta1();
}
}
