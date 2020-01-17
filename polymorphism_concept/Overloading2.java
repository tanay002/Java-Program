package com.concept_basic;
//compile time/static binding-overloading
//compiler knows which methods will be executed
//all methods should be same 
//we must have different no of parameters or types
//**** Access specifier,return type ka role nhi hota overloading me;
public class Overloading2
{
	float calculate(float x)
	{
		return x+10;
	}
	int calculate(int x,int y)
	{
		return x*y;
	}

	float calculate(int x,float y,int z)
	{
		return x*y*z;
	}

	public static void main(String[]args)
	{
		Overloading2 o=new Overloading2();
		System.out.println(o.calculate(5.0f)+" "+o.calculate(5,7.0f,8)+" "+o.calculate(5,7));
	}
}
