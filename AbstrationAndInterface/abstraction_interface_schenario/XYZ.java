package com.abstraction;
interface Alpha2
{
	public void demo();	
	public void task();


}
interface Beta2 extends Alpha2
{
	public void demo();
}
abstract class Gamma3 implements Beta2
{
	/*
	 * public void demo() { System.out.println("java"); }
	 */
	public abstract void demo();
}
public class XYZ implements Beta2
{

	public void demo() 
	{ 
		System.out.println("hello"); 
	}

	public static void main(String[] args) {

		Alpha2 b=	new XYZ();
		b.demo();

	}

	@Override
	public void task() {
		// TODO Auto-generated method stub

	}
}
