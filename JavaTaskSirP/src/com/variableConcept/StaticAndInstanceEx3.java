package com.variableConcept;

public class StaticAndInstanceEx3 
{
	int x=20;
	static int y=40;

	public static void main(String[] args)
	{
		StaticAndInstanceEx3 s=new StaticAndInstanceEx3();
		s.x=199;
		s.y=200;
		System.out.println(s.x+" "+s.y);

		StaticAndInstanceEx3 s1=new StaticAndInstanceEx3();
		System.out.println(s1.x+" "+s1.y);
	}
}
