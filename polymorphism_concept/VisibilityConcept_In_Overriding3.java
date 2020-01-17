package com.polymorphism_concept;

public class VisibilityConcept_In_Overriding3
{

	public static void main(String[] args)
	{
		Branch2 a=new Branch2();
		a.main();
		a.main_meth();
		a.main_meth_2();
		Subject2 b=new Subject2();
		b.main();
		b.main_meth();
		b.main_meth_2();
		Branch2 a1=new Subject2();
		a1.main();
		a1.main_meth();
		a1.main_meth_2();
	}
}

class Branch2
{
	void main()                      //1
	{
		System.out.println("main method of Branch");
	}

	void main_meth()                 //2
	{
		System.out.println("main method of SuperBranch");
	}

	void main_meth_2()                 //3
	{
		System.out.println("main method of altraSuperBranch");
	}

}

class Subject2 extends Branch2
{
	public void main()                            //1
	{
		System.out.println("main method of Subject");
	}

	protected void main_meth()              //3
	{
		System.out.println("main method of SuperSubject");
	}

	void main_meth_2()                 //2
	{
		System.out.println("main method of altraSuperSubject");
	}

}