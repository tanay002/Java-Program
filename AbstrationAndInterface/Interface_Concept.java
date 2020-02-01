package com.AbstrationAndInterface;

interface Concept 
{
	void method();                                     //abstract method me hum body nhi de sakte         
	public void memo();      //All are sare ..bydefault abstract method are public abstract
	abstract void demo();     //method can't be protected,private 
	public abstract void Task();

	static void methodTask()
	{

	}

	default void methodTaskw()
	{

	}
}
class Interface_Concept
{
	public static void main(String[] args) 
	{
		//Concept c=null; NullPointerException

	}	

}