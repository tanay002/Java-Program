package com.inner.classes;

import java.util.Scanner;
//Case 6  If we declare inner class inside static method then from that method local inner class we can access only static member
  //of outer class directly from that member local inner class
class Outer7
{
	int i=30;
	static int l=20;
	static void demo()
	{
		int i=20;  //How can i access that variable
		class Inner
		{  
			int i=40;
			void sum(int i,int j)
			{
				System.out.println(this.i);
				//System.out.println(Outer7.this.i);
				System.out.println(Outer7.l);
				System.out.println("Sum"+(i+j));
			}
		}
		Inner k=new Inner();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter two Number:- ");
		k.sum(sc.nextInt(),sc.nextInt());

	}

}
public class LocalInnerClass7
{
	public static void main(String[] args) 
	{
		Outer7 o=new Outer7();
		o.demo();
	}
}
