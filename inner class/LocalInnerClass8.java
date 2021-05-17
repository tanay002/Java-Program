package com.inner.classes;

//Case 9 If we declare method as static then we can access only static variable of outer class
//In below example  j and k is accessible and i isn not accessible
class Outer8
{
	int i=10;
	static int j=20;
	public static void m1()
	{
		int k=20;
		class Inner
		{
			public void m2()
			{
				System.out.println(j+" "+k);
			//	System.out.println(i);  //Cannot make a static reference to the non-static field
			}
		}
	}
}
public class LocalInnerClass8 {

}
