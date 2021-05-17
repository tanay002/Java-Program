package com.inner.classes;

//Case 5: Applicable modifier for outer class:- public ,default ,final,abstract,strictfp
// Applicable modifier for inner class:- public ,default ,protected, private ,final ,static, strictfp, abstract

//Case 6: Inside Inner class we can declare another inner class

class Outer5  
{ int i=10;
class Inner5
{
	int i=20;
	class SubInnerClass
	{
		int i=30;
		void demo()
		{

			System.out.println(Outer5.Inner5.this.i+Inner5.this.i+this.i);
		}
	}

}
}

public class OutsideClassApplicableModifier5
{
	public static void main(String[] args) 
	{
		Outer5.Inner5.SubInnerClass ois=new Outer5().new Inner5().new SubInnerClass();
		ois.demo();
	}
}
