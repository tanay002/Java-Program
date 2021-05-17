package com.objectclass;
class Mama
{
	void demo()
	{
		System.out.println("Indore");
	}
}
public class MMM extends Mama
{
 void demo()
	{
		System.out.println("Bhopal");
	}
	
	public static void main(String[] args) {
		
		Mama m=new MMM();
		m.demo();
	}
}
