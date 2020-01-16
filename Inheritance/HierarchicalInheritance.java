package com.inheritance;
//In inheritance concept..we can say that 
//Jiska reference uski method
class GrandParents
{
	public void demo1()
	{
		System.out.println("Methods of GrandParent");
	}
}


class Parents extends GrandParents
{
	public void demo2()
	{
		System.out.println("Methods of Parent");
	}

}

class Childs extends GrandParents
{
	public void demo3()
	{
		System.out.println("Methods of child");
	}

}

class SmallChilds extends GrandParents
{
	public void demo31k()
	{
		System.out.println("Methods of Smallchild");
	}

}
public class HierarchicalInheritance
{

	public static void main(String[] args) 
	{
		
		Childs c=new Childs();
	    c.demo1();
	    c.demo3();
		Parents p=new Parents();
	      p.demo1();
	      p.demo2();
		SmallChilds scl=new SmallChilds();
		scl.demo1();
		scl.demo31k();
		GrandParents g=new GrandParents();
		g.demo1();
	}
}