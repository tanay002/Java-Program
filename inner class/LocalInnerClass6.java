package com.inner.classes;

import java.util.Scanner;
//Case 6  If we declare inner class inside instance method then from that method local inner class we can access both static and non static member
//of outer class

//Case 7 Agar same variable outer class me bhi hai aur inner class me bhi hai to hame 
//specify karna padega hum konsa variable ko use kar rhe hai by using "this"  line 25 line 26

//Case 8: From method local inner class we can access local variables of the method in which we declare inner class
class Outer6
{
	int i=30;
	static int l=20;
	void demo()
	{  
		int p=70;
		int o=20;  //How can i access that variable
		class Inner
		{  
			int g=56;
			int i=40;
			void sum(int i,int j)
			{
				System.out.println(p);
				System.out.println(g);
				System.out.println(this.i);
				System.out.println(Outer6.this.i);
				System.out.println(Outer6.l);
				System.out.println("Sum"+(i+j));
			}
		}
		Inner k=new Inner();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter two Number:- ");
		k.sum(sc.nextInt(),sc.nextInt());
		sc.close();

	}

}
public class LocalInnerClass6 
{
	public static void main(String[] args) 
	{
		Outer6 o=new Outer6();
		o.demo();
	}
}
