package com.inner.classes;

//Case 10 If we declare m2 method as static then we will get cte because we can't declare static member inside inner classes
class Outer9
{
	int i=10;
	static int j=20;
	public void m1()
	{
		int k=20;
		class Inner
		{
		//	public static void m2()
			{
				System.out.println(j+" "+k);
		
			}
		}
	}
}
public class LocalInnerClass9 {

}
