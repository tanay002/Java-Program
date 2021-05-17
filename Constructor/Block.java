package com.constructor;
class Alpha
{
	{
		System.out.println("Hello");
	}	
	{
		System.out.println("wao");
		
	}
	Alpha()
	{
		//this(10);
		System.out.println("done");
	}
		Alpha(int i)
		{
			System.out.println("para");
		}
}

class Beta extends Alpha
{
	{
		System.out.println("Hello2");
	}	
	{
		System.out.println("wao2");
		
	}
	Beta()
	{   //super(10);
		System.out.println("done2");
	}
}
public class Block
{
public static void main(String[] args) {
	 Beta b=new Beta();
}
}
