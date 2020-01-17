package com.polymorphism_concept;

public class OverloadingCT2
{
	void meth(int i,int j)                   //If we comment this method,and when we pass parameter (int,int) while calling
	{                                           // this method then,if it does not found the method
		System.out.println(i+j);	               //It will typecast to next datatype as followed by rules
	}                                          //byte->short->int->long->float->double       (Read Down note)


	void meth(int i,float j)
	{
		System.out.println(i+j);
	}

	void meth(float i,int j)
	{
		System.out.println(i+j);
	}

	public static void main(String[] args) 
	{
		OverloadingCT2 o=new OverloadingCT2();
		o.meth(9,4);    //ambiguity and confusion
		o.meth(3f,4);            //o.meth(3,4)      //It will Typecast from both side (left parameter) and (Right Parameter) 
		o.meth(7,4f);                                // so we get (int,float) from typecasting for left and (float,int) from 
	}		                                                //typecasting from right
}
