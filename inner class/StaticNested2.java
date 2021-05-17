package com.classs.staticnested;

import com.classs.staticnested.Outer.Inner;

class Outer
{
	static class Inner
	{
		public void method()
		{
            System.out.println("Static class method");
		}
	}
}
public class StaticNested2
{
public static void main(String[] args) 
{
//Outer.Inner si=new Outer.Inner();
	Inner si=new Inner();

}
}
