package com.polymorphism_concept;

public class VisibilityConcept_In_Overriding2
{

	public static void main(String[] args)
	{
      Branch1 a=new Branch1();
      a.main();
      a.main_meth();
      Subject1 b=new Subject1();
      b.main();
      b.main_meth();
      Branch1 a1=new Subject1();
      a1.main();
      a1.main_meth();
      
    
	}
}

class Branch1
{
	protected void main()                      //1
	{
		System.out.println("main method of Branch");
	}
	
	protected void main_meth()                 //2
	{
		System.out.println("main method of SuperBranch");
	}

}

class Subject1 extends Branch1
{
	public void main()                            //1
	{
		System.out.println("main method of Subject");
	}
	
	protected void main_meth()                  //2
	{
		System.out.println("main method of SuperSubject");
	}

}