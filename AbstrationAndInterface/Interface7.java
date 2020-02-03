package com.AbstrationAndInterface;
//Ambiguity problem of same variable in different Interface when we implements Multiple Interface
//Confuse which ones to call so we call that variable by class name(variable is ByDefault static final in interface)
interface Alphaaa
{
	public static final int i=10;
	public void demo();
	public void printShow();
}
interface Bettaa
{
	int j=20;	
	int i=15;
	public void show();
	public void printShow();
}
public class Interface7 implements Bettaa,Alphaaa
{   
	public void demo() 
	{
		System.out.println("demo");
	}

	public void show()
	{
		System.out.println("show");	
	}
    
	public void printShow()
	{
		System.out.println("Print Show method");
	}
	public static void main(String[] args)
	{
		Bettaa in=new Interface7();
		in.show();
		in.printShow();
		System.out.println("");
		Alphaaa ap=new Interface7();
		ap.demo();
		ap.printShow();
		System.out.println("");
		Interface7 inte=new Interface7();
		inte.demo();
		inte.printShow();
		inte.show();
	//	System.out.println(i); //Ambiguity Problem while calling i variable .....so we call it by its class name..or by creating 
		  // object with reference of particular interface
		System.out.println(Alphaaa.i);
		System.out.println(Bettaa.i);
	}
               
}
