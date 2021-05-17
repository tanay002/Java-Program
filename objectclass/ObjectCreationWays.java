package com.practice;
class TryObject
{
static void demo(int i)
{
	System.out.println("shs");
	}
	void demo()
	{
		System.out.println("Hello");
	}
	}
public class ObjectCreationWays
{
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
	
TryObject ob=TryObject.class.newInstance();
ob.demo();
ob.demo(10);
	}
}
