package com.nested;

public class MembeInnerClass5 
{
	int k=20;
	static int j=10;

	void remo()
	{
		System.out.println("Remo");
	}

	static void Memo()
	{
		System.out.println("Cool");
	}

	void demoOuter()
	{
		int k=80;
		int j=19;  //kaise access kare?

	   class Inner  //final and abstract is applicable..can't be public ,protected,private 
		{
			int k=90;
			int j=14;

			void demoInner()//agar mene is method ko static bana diya to me outer class ke static member ko hi access kar paunga
			{                         //par inner class me agar variable static ho ya nhi ho..hum doi ko access kar payenge
				int k=30;
				System.out.println("Demo Inner");
				Memo();
				remo();
				System.out.println(k);
				System.out.println(this.k+" "+this.j); //or by this.k   this.j


				System.out.println(MembeInnerClass5.this.k);
				System.out.println(MembeInnerClass5.j);

			}
			
			
			
			/*static void demo()
			{
				 Can't declare static member inside inner class
			} */
			
		}
		Inner i=new Inner();
		i.demoInner();
	}
	public static void main(String[] args) 
	{
		MembeInnerClass5 m=new MembeInnerClass5();
		m.demoOuter();
	}
}
